package czh.fast.sample.mvp.contract

import czh.fast.lib.base.BasePresenter
import czh.fast.lib.base.BaseView
import czh.fast.sample.mvp.model.Advert

interface NetContract {
    interface Presenter : BasePresenter {
        fun normalTask()
        fun cacheTask()
    }

    interface View : BaseView<Presenter> {
       fun showResult(advert: Advert)
    }
}