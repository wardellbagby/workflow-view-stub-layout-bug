# WorkflowViewStub + ContraintLayout / RelativeLayout Bug

Showcases an issue where using a WorkflowViewStub with a ConstraintLayout (or RelativeLayout) and setting a view to be constrained to the WorkflowViewStub fails.

Also showcases an issue where you can't build the app without including the `implementation 'com.squareup.workflow:workflow-tracing:0.26.0'`, even though that is apart of the API of `com.squareup.workflow:workflow-ui-core-android:0.26.0`

