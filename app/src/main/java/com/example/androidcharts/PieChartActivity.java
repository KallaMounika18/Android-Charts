package com.example.androidcharts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        PieChart pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> visitors = new ArrayList<>();
        visitors.add(new PieEntry(508,2016));
        visitors.add(new PieEntry(600,2017));
        visitors.add(new PieEntry(750,2018));
        visitors.add(new PieEntry(600,2019));
        visitors.add(new PieEntry(670,2020));

        PieDataSet pieDataSet = new PieDataSet(visitors, "visitors");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.BLACK);
        pieDataSet.setValueTextSize(16f);

        PieData pieData = new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("visitors");
        pieChart.animate();
    }
}