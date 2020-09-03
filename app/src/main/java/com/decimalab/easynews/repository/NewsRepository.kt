package com.decimalab.easynews.repository

import com.decimalab.easynews.api.RetrofitInstance
import com.decimalab.easynews.db.ArticleDatabase


class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}