package com.bsnl.sample.pkg.feature.data.model

import com.bsnl.common.viewmodel.IBaseList

/**
 * @author : LeeZhaoXing
 * @date   : 2020/11/19
 * @desc   :
 */

data class PokemonListResponse(
    val count: Int?=0,
    val next: String?="",
    val previous: String?="",
    var results: List<PokeItemModel>
) : IBaseList {
    override fun getDataList(): List<Any>? {
        return results
    }

    override fun getTotals(): Int {
        return count!!
    }

}


