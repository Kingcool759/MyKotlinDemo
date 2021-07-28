package com.example.mykotlindemo.display2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.evrencoskun.tableview.TableView
import com.example.mykotlindemo.R
import com.example.mykotlindemo.arout.RouterPath
import com.example.mykotlindemo.tableview.TableViewAdapter
import com.example.mykotlindemo.tableview.TableViewListener
import com.example.mykotlindemo.tableview.TableViewModel

@Route(path = RouterPath.kotlin36)
class Kotlin36 : AppCompatActivity() {

//    lateinit var mTableView: TableView
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin36)
//        mTableView = findViewById<TableView>(R.id.tableView)
//        initializeTableView()
    }
//    private fun initializeTableView() {
//        // Create TableView View model class  to group view models of TableView
//        val tableViewModel = TableViewModel()
//
//        // Create TableView Adapter
//        val tableViewAdapter = TableViewAdapter(tableViewModel)
//        mTableView.setAdapter<Any, Any, Any>(tableViewAdapter)
//        mTableView.setTableViewListener(TableViewListener(mTableView))
//
//        // Create an instance of a Filter and pass the TableView.
//        //mTableFilter = new Filter(mTableView);
//
//        // Load the dummy data to the TableView
//        tableViewAdapter.setAllItems(
//            tableViewModel.getColumnHeaderList(), tableViewModel
//                .getRowHeaderList(), tableViewModel.getCellList()
//        )

        //mTableView.setHasFixedWidth(true);

        /*for (int i = 0; i < mTableViewModel.getCellList().size(); i++) {
            mTableView.setColumnWidth(i, 200);
        }*)

        //mTableView.setColumnWidth(0, -2);
        //mTableView.setColumnWidth(1, -2);

        / *mTableView.setColumnWidth(2, 200);
        mTableView.setColumnWidth(3, 300);
        mTableView.setColumnWidth(4, 400);
        mTableView.setColumnWidth(5, 500);*/
//    }
}