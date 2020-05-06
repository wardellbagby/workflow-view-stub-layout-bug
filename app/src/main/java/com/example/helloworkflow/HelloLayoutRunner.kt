package com.example.helloworkflow

import android.view.View
import android.widget.TextView
import com.squareup.workflow.ui.LayoutRunner
import com.squareup.workflow.ui.LayoutRunner.Companion.bind
import com.squareup.workflow.ui.ViewEnvironment
import com.squareup.workflow.ui.ViewFactory
import com.squareup.workflow.ui.WorkflowViewStub

class HelloLayoutRunner(view: View) : LayoutRunner<HelloWorkflow.Rendering> {
  private val messageView: TextView = view.findViewById(R.id.hello_message)
  private val stub = view.findViewById<WorkflowViewStub>(R.id.stub)

  override fun showRendering(
    rendering: HelloWorkflow.Rendering,
    viewEnvironment: ViewEnvironment
  ) {
    messageView.text = rendering.greeting
    messageView.setOnClickListener { rendering.onClick() }
    stub.update(rendering.speaker, viewEnvironment)
  }

  companion object : ViewFactory<HelloWorkflow.Rendering> by bind(
      R.layout.hello_goodbye_layout, ::HelloLayoutRunner
  )
//// Uncomment this for RelativeLayout
//  companion object : ViewFactory<HelloWorkflow.Rendering> by bind(
//      R.layout.hello_goodbye_relative_layout, ::HelloLayoutRunner
//  )
}
