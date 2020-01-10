package io.gettis.yetanothercounter.component

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        child(Counter::class) {
            attrs {
                initialValue = 42
            }
        }
    }
}