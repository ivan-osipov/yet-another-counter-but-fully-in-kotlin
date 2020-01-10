package io.gettis.yetanothercounter.component

import react.*
import react.dom.span

class Counter : RComponent<Counter.Props, Counter.State>() {

    override fun State.init(props: Counter.Props) {
        setState {
            count = props.initialValue
        }
    }

    override fun RBuilder.render() {
        span {
            +"${state.count}"
        }
    }

    interface State : RState {
        var count: Long
    }

    interface Props : RProps {
        var initialValue: Long
    }
}