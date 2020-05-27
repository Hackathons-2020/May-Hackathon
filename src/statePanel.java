import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
public class statePanel extends JPanel{
    private JLabel deaths;
    private JLabel cases;
    private JLabel stateName;
    private JLabel date;
    public statePanel(){
        this.setPreferredSize(new Dimension(1050, 694));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JPanel chartPane = new JPanel();
        chartPane.setPreferredSize(new Dimension(1050, 700));
        chartPane.setLayout(new BorderLayout());
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.setPreferredSize(new Dimension(680, 500));
         deaths = new JLabel("Dead: 0");
         cases = new JLabel("Cases: 0");
         stateName = new JLabel("State");
         date = new JLabel("Data for: Feburary 1 2020");
         infoPanel.add(stateName);
         infoPanel.add(date);
         infoPanel.add(deaths);
        infoPanel.add(cases);
        XYDataset dataset = createDataset();
        JFreeChart chart = createChart(dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        chartPanel.setBackground(Color.white);
        chartPane.add(chartPanel);
        this.add(infoPanel);
        this.add(chartPane);
    }
    @Override
    public Dimension getPreferredSize() {
        int w = 1050;
        int h = 700;
        return new Dimension(w, h);
    }
    public void changeDeathLabel(String temp)
    {
      deaths.setText(""+temp);
    }

    public void changeStateLabel(String temp)
    {
        stateName.setText(""+temp);
    }

    public void changeDateLabel(String temp)
    {
        date.setText(""+temp);
    }

    public void changeCasesLabel(String temp)
    {
        cases.setText(""+temp);
    }


    private XYDataset createDataset() {

        // var series = new XYSeries("2016");
        XYSeries series = new XYSeries("2016");
        series.add(18, 567);
        series.add(20, 612);
        series.add(25, 800);
        series.add(30, 980);
        series.add(40, 1410);
        series.add(80, 250);

        //var dataset = new XYSeriesCollection();
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        return dataset;
    }

    private JFreeChart createChart(XYDataset dataset) {

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Average salary per age",
                "Age",
                "Salary (€)",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        XYPlot plot = chart.getXYPlot();

        //   var renderer = new XYLineAndShapeRenderer();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesStroke(0, new BasicStroke(2.0f));

        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.white);

        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.BLACK);

        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.BLACK);

        chart.getLegend().setFrame(BlockBorder.NONE);

        chart.setTitle(new TextTitle("Average Salary per Age",
                        new Font("Serif", java.awt.Font.BOLD, 18)
                )
        );

        return chart;
    }

}
