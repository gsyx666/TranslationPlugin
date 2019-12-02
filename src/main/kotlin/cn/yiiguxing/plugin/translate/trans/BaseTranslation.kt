package cn.yiiguxing.plugin.translate.trans

open class BaseTranslation(
    open val srcLang: Lang,
    open val targetLang: Lang,
    open val translation: String?
)