package com.eman.trudocapp.presentation.ui.main.pagingadaptertest

import com.eman.trudocapp.domain.model.Business

object BussinessData {

    fun getItems(size: Int): List<Business> {
        return Array(size) {
            Business(it.toString(), "Item $it")
        }.toList()
    }

    // 累加
    fun getIncreaseItems(start: String, size: Int): List<Business> {
        return Array(size) {
            val index = start.toInt() + it
            Business(index.toString(), "Item $index")
        }.toList()
    }

    // 累減，陣列的第一個元素是最小的數
    fun getReduceItems(start: Int, size: Int): List<Business> {
        return Array(size) {
            val index = (start - size) + it
            Business(index.toString(), "Item $index")
        }.toList()
    }
}