package com.bsnl.common.dataBinding

import android.os.Bundle
import com.bsnl.base.log.L
import com.bsnl.common.viewmodel.BaseViewModel


/**
 * @author : LeeZhaoXing
 * @date   : 2020/9/16
 * @desc   : 懒加载列表
 */
abstract class LazyListDataBindingFragment<T : BaseViewModel> : ListDataBindingFragment<T>() {
    private var mHasInit = false


    override fun initData() {

    }

    override fun initView() {

    }


    override fun onResume() {
        super.onResume()
        if (!mHasInit) {
            mHasInit = true
            setupListViewDelegate()
            setupLiveDataCallback()
            setupRefreshCallback()
            fetchData()
        }
    }


    override fun onDestroyView() {
        mHasInit=false
        super.onDestroyView()
    }

}