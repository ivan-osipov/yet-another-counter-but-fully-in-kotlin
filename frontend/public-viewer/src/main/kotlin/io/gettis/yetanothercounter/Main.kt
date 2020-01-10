package io.gettis.yetanothercounter

import io.gettis.yetanothercounter.component.app
import react.dom.render
import kotlin.browser.document

fun main() {
    render(document.getElementById("root")) {
        app()
    }
}