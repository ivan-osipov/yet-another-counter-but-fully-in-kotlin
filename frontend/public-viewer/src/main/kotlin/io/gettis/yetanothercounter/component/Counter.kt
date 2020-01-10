package io.gettis.yetanothercounter.component

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.span

class Counter(props: Counter.Props) : RComponent<Counter.Props, RState>(props) {

    override fun RBuilder.render() {
        span {
            +"${props.initialValue}"
        }
    }

    interface Props : RProps {
        var initialValue: Long
    }
}

fun RBuilder.counter(initialValue: Long) = child(Counter::class) {
    attrs {
        this.initialValue = initialValue
    }
}