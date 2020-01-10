plugins {
    kotlin("js")
}

kotlin {
    repositories {
        maven("https://dl.bintray.com/kotlin/kotlin-js-wrappers")
        maven("https://dl.bintray.com/kotlin/kotlinx")
        jcenter()
    }
    sourceSets {
        main {
            dependencies {
                implementation(kotlin("stdlib-js"))
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.3.3")

                implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.6.12")
                implementation("org.jetbrains:kotlin-react:1.0.0-pre.89-kotlin-1.3.60")
                implementation("org.jetbrains:kotlin-react-dom:1.0.0-pre.89-kotlin-1.3.60")
                implementation("org.jetbrains:kotlin-css:1.0.0-pre.89-kotlin-1.3.60")
                implementation("org.jetbrains:kotlin-css-js:1.0.0-pre.89-kotlin-1.3.60")
                implementation("org.jetbrains:kotlin-styled:1.0.0-pre.89-kotlin-1.3.60")

                implementation(npm("kotlinx-html", "0.6.12"))
                implementation(npm("@jetbrains/kotlin-react", "16.9.0-pre.89"))
                implementation(npm("@jetbrains/kotlin-react-dom", "16.9.0-pre.89"))
                implementation(npm("@jetbrains/kotlin-css", "1.0.0-pre.89"))
                implementation(npm("@jetbrains/kotlin-css-js", "1.0.0-pre.89"))
                implementation(npm("@jetbrains/kotlin-styled", "1.0.0-pre.89"))
                implementation(npm("@jetbrains/kotlin-extensions", "1.0.1-pre.89"))

                implementation(npm("react", "16.9.0"))
                implementation(npm("react-dom", "16.9.0"))
                implementation(npm("styled-components", "4"))
                implementation(npm("inline-style-prefixer", "5.1.0"))
                implementation(npm("css-in-js-utils", "3.0.2"))
            }
        }
    }
    target {
        useCommonJs()
        browser()
    }
}