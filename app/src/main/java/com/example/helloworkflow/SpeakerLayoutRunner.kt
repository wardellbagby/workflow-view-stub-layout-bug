package com.example.helloworkflow

import android.view.View
import android.widget.TextView
import com.squareup.workflow.ui.LayoutRunner
import com.squareup.workflow.ui.LayoutRunner.Companion.bind
import com.squareup.workflow.ui.ViewEnvironment
import com.squareup.workflow.ui.ViewFactory

data class SpeakerRendering(val message: String)

class SpeakerLayoutRunner(view: View) : LayoutRunner<SpeakerRendering> {
    private val messageView: TextView = view.findViewById(R.id.location_message)

    override fun showRendering(rendering: SpeakerRendering, viewEnvironment: ViewEnvironment) {
        messageView.text = rendering.message
    }

    companion object : ViewFactory<SpeakerRendering> by bind(
        R.layout.location_layout, ::SpeakerLayoutRunner
    )
}
