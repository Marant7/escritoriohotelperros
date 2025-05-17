
package Negocio;

import Config.Conexion;
import java.sql.*;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class clsReportes {
        Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs; //almaceba datos en la consulta
    Statement st;
    
    
    
    // Método para generar el reporte de reservas por año
    public void ReporteCanPorAÑO() {
        try {
            con = cn.getConnection();

            // Consulta SQL para obtener el número de reservas pagadas por año
            String consulta = "SELECT YEAR(fecha_inicio) AS anio, COUNT(*) AS cantidad_reservas "
                            + "FROM tbreserva "
                            + "WHERE proceso = 'pago' "
                            + "GROUP BY YEAR(fecha_inicio) "
                            + "ORDER BY YEAR(fecha_inicio)";

            st = con.createStatement();
            rs = st.executeQuery(consulta);

            // Crear el dataset para el gráfico de líneas
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            while (rs.next()) {
                int anio = rs.getInt("anio");
                int cantidadReservas = rs.getInt("cantidad_reservas");
                dataset.addValue(cantidadReservas, "Reservas Pagadas", String.valueOf(anio));
            }

            // Crear el gráfico de líneas
            JFreeChart chart = ChartFactory.createLineChart(
                "Reservas Pagadas por Año", // Título del gráfico
                "Año", // Etiqueta del eje X
                "Cantidad de Reservas", // Etiqueta del eje Y
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Orientación del gráfico
                true, // Incluir leyenda
                true, // Mostrar tooltips
                false // No generar URLs
            );

            // Mostrar el gráfico en un ChartFrame
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

            JFrame frame = new JFrame("Reporte de Reservas por Año");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setContentPane(chartPanel);
            frame.pack();
            frame.setVisible(true);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos en el bloque finally
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public void CantidadPerros(){
        try {
            con = cn.getConnection();

            // Consulta SQL para obtener el número de perros hospedados por mes
            String consulta = "SELECT MONTH(fecha_inicio) AS mes, COUNT(*) AS cantidad_perros "
                            + "FROM tbreserva "
                            + "WHERE proceso = 'pago'"
                            + "AND YEAR(fecha_inicio) = YEAR(CURDATE()) "
                            + "GROUP BY MONTH(fecha_inicio) "
                            + "ORDER BY MONTH(fecha_inicio)";

            st = con.createStatement();
            rs = st.executeQuery(consulta);

            // Crear el dataset para el gráfico de líneas
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            while (rs.next()) {
                int mes = rs.getInt("mes");
                int cantidadPerros = rs.getInt("cantidad_perros");
                dataset.addValue(cantidadPerros, "Perros Hospedados", String.valueOf(mes));
            }

            // Crear el gráfico de líneas
            JFreeChart chart = ChartFactory.createBarChart(
                "Ocupación Mensual de Hospedaje de Perros", // Título del gráfico
                "Mes", // Etiqueta del eje X
                "Cantidad de Perros", // Etiqueta del eje Y
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Orientación del gráfico
                true, // Incluir leyenda
                true, // Mostrar tooltips
                false // No generar URLs
            );

            // Mostrar el gráfico en un ChartFrame
            ChartFrame frame = new ChartFrame("Reporte de Ocupación Mensual", chart);
            frame.pack();
            frame.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos en el bloque finally
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void GananciaPorMes(String year) {
        
        String año = year;
    try {
        // Obtener la conexión a la base de datos utilizando la instancia de la clase Conexion
        con = cn.getConnection();

        // Consulta SQL para obtener el monto total por mes para el año especificado
        String consulta = "SELECT DATE_FORMAT(fecha_pago, '%Y-%m') AS mes, SUM(monto) AS monto_total " +
                          "FROM tbpago " +
                          "WHERE YEAR(fecha_pago) = ? " +
                          "GROUP BY mes " +
                          "ORDER BY mes";

        // Crear una declaración preparada para ejecutar la consulta con el año especificado
        ps = con.prepareStatement(consulta);
        ps.setString(1, año);

        // Ejecutar la consulta y obtener los resultados
        rs = ps.executeQuery();

        // Crear un dataset para el gráfico de barras
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Procesar los resultados y agregarlos al dataset
        while (rs.next()) {
            String mes = rs.getString("mes");
            double montoTotal = rs.getDouble("monto_total");
            dataset.addValue(montoTotal, "Monto Total", mes);
        }

        // Crear el gráfico de barras vertical
        JFreeChart chart = ChartFactory.createBarChart(
            "Monto Total por Mes", // Título del gráfico
            "Mes", // Etiqueta del eje X
            "Monto Total", // Etiqueta del eje Y
            dataset, // Dataset
            PlotOrientation.VERTICAL, // Orientación del gráfico
            true, // Mostrar leyenda
            false, // No mostrar tooltips
            false // No generar URLs
        );

        // Mostrar el gráfico en un ChartFrame
        ChartFrame frame = new ChartFrame("Reporte de Monto Total por Mes", chart);
        frame.pack();
        frame.setVisible(true);
    } catch (SQLException e) {
        e.printStackTrace();
    } 
}
    public void CantidadPorDia() {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

    try {
        // Obtener la conexión a la base de datos utilizando la instancia de la clase Conexion
        con = cn.getConnection();

        // Consulta SQL para obtener los datos requeridos
        String consulta = "SELECT tbreserva.id_reserva, tbreserva.fecha_inicio, " +
                          "tbdetalle_reserva.id_mascota, tbdetalle_reserva.monto_total_reserva " +
                          "FROM tbreserva " +
                          "INNER JOIN tbdetalle_reserva ON tbreserva.id_detalle_reserva = tbdetalle_reserva.id_detalle_reserva";

        // Crear una declaración para ejecutar la consulta
        st = con.createStatement();

        // Ejecutar la consulta y obtener los resultados
        rs = st.executeQuery(consulta);

        // Crear un dataset para el gráfico de líneas
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Procesar los resultados y agregarlos al dataset
        while (rs.next()) {
            String idReserva = rs.getString("id_reserva");
            Date fechaInicio = rs.getDate("fecha_inicio");
            int idMascota = rs.getInt("id_mascota");
            double montoTotal = rs.getDouble("monto_total_reserva");

            // Aquí se puede procesar cada fila según lo requieras
            // Por ejemplo, agregar al dataset según una lógica específica
            // dataset.addValue(valor, "Etiqueta", "Categoría");
            // Por ejemplo:
            dataset.addValue(montoTotal, "Monto Total", idReserva);
        }

        // Crear el gráfico de líneas (ejemplo básico)
        JFreeChart chart = ChartFactory.createLineChart(
            "Monto Total por Reserva", // Título del gráfico
            "ID de Reserva", // Etiqueta del eje X
            "Monto Total", // Etiqueta del eje Y
            dataset, // Dataset
            PlotOrientation.VERTICAL, // Orientación del gráfico
            true, // Mostrar leyenda
            true, // Mostrar tooltips
            false // No generar URLs
        );

        // Mostrar el gráfico en un ChartFrame
        ChartFrame frame = new ChartFrame("Reporte de Monto Total por Reserva", chart);
        frame.pack();
        frame.setVisible(true);
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Cerrar la conexión y liberar recursos en el bloque finally
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


    
    public void GananciaPorAño(){
        try {
            con = cn.getConnection();

            // Consulta SQL para obtener las ganancias por año
            String consulta = "SELECT YEAR(fecha_pago) AS anio, SUM(monto) AS ganancias "
                            + "FROM tbpago "
                            + "GROUP BY YEAR(fecha_pago) "
                            + "ORDER BY anio";

            st = con.createStatement();
            rs = st.executeQuery(consulta);

            // Crear el dataset para el gráfico de barras
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            while (rs.next()) {
                int anio = rs.getInt("anio");
                double ganancias = rs.getDouble("ganancias");
                dataset.addValue(ganancias, "Ganancias", String.valueOf(anio));
            }

            // Crear el gráfico de barras
            JFreeChart chart = ChartFactory.createBarChart(
                "Ganancias por Año", // Título del gráfico
                "Año", // Etiqueta del eje X
                "Ganancias", // Etiqueta del eje Y
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Orientación del gráfico
                true, // Incluir leyenda
                true, // Mostrar tooltips
                false // No generar URLs
            );

            // Mostrar el gráfico en un ChartFrame
            ChartFrame frame = new ChartFrame("Reporte de Ganancias por Año", chart);
            frame.pack();
            frame.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión y liberar recursos en el bloque finally
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void PerrosPorTamaño(){
        try {
        con = cn.getConnection();

        // Consulta SQL para obtener la cantidad de perros por tamaño
        String consulta = "SELECT tamaño, COUNT(*) AS cantidad_perros "
                        + "FROM tbmascota "
                        + "GROUP BY tamaño";

        st = con.createStatement();
        rs = st.executeQuery(consulta);

        // Crear el dataset para el gráfico de pastel
        DefaultPieDataset dataset = new DefaultPieDataset();
        while (rs.next()) {
            String tamaño = rs.getString("tamaño");
            int cantidadPerros = rs.getInt("cantidad_perros");
            dataset.setValue(tamaño, cantidadPerros);
        }

        // Crear el gráfico de pastel
        JFreeChart chart = ChartFactory.createPieChart(
            "Cantidad de Perros por Tamaño", // Título del gráfico
            dataset, // Dataset
            true, // Incluir leyenda
            true, // Mostrar tooltips
            false // No generar URLs
        );

        // Mostrar el gráfico en un ChartFrame
        ChartFrame frame = new ChartFrame("Reporte de Perros por Tamaño", chart);
        frame.pack();
        frame.setVisible(true);
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Cerrar la conexión y liberar recursos en el bloque finally
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    }
    public void ServicioMasPopular() {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;

    try {
        // Obtener la conexión a la base de datos utilizando la instancia de la clase Conexion
        con = cn.getConnection();

        // Consulta SQL para obtener la cantidad de reservas por servicio
        String consulta = "SELECT s.descripcion, COUNT(*) AS cantidad " +
                          "FROM tbdetalle_servicios ds " +
                          "INNER JOIN tbservicios s ON ds.id_servicio = s.id_servicio " +
                          "GROUP BY s.descripcion";

        // Crear una declaración para ejecutar la consulta
        st = con.createStatement();

        // Ejecutar la consulta y obtener los resultados
        rs = st.executeQuery(consulta);

        // Crear el dataset para el gráfico tipo pastel
        DefaultPieDataset dataset = new DefaultPieDataset();

        // Procesar los resultados y agregarlos al dataset
        while (rs.next()) {
            String descripcion = rs.getString("descripcion");
            int cantidad = rs.getInt("cantidad");
            dataset.setValue(descripcion, cantidad);
        }

        // Crear el gráfico tipo pastel
        JFreeChart chart = ChartFactory.createPieChart(
            "Cantidad de Reservas por Servicio", // Título del gráfico
            dataset, // Dataset
            true, // Mostrar leyenda
            true, // Mostrar tooltips
            false // No generar URLs
        );

        // Mostrar el gráfico en un ChartFrame
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

        JFrame frame = new JFrame("Reporte de Cantidad de Reservas por Servicio");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setVisible(true);

    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Cerrar la conexión y liberar recursos en el bloque finally
        try {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
}

