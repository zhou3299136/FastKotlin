package czh.fast.sample.application

import android.content.Context
import com.raizlabs.android.dbflow.config.FlowManager
import czh.fast.lib.application.BaseApp


class MyAPP : BaseApp() {
    override fun onCreate() {
        super.onCreate()
        FlowManager.init(this)
        instance = this
    }

    override val BaseUrl: String
        get() = "http://101.132.131.51/share/"


    companion object {
        /**
         * 全局的上下文
         */
        /**
         * 获取context

         * @return
         */
        lateinit var instance: Context

    }
}