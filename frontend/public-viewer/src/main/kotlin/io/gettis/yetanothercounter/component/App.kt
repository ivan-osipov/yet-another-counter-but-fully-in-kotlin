package io.gettis.yetanothercounter.component

import kotlinx.html.js.onClickFunction
import react.*
import react.dom.button

class App : RComponent<RProps, App.State>() {

    override fun App.State.init() {
        counterValue = 42
    }

    override fun RBuilder.render() {
        button {
            +"-"
            attrs {
                onClickFunction = {
                    setState {
                        counterValue = state.counterValue.dec()
                    }
                }
            }
        }
        counter(state.counterValue)
        button {
            +"+"
            attrs {
                onClickFunction = {
                    setState {
                        counterValue = state.counterValue.inc()
                    }
                }
            }
        }
    }

    interface State: RState {
        var counterValue: Long
    }
}

fun RBuilder.app() = child(App::class) {}