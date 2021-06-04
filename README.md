# [Cars App]

## How to Run

once the app is opened it will load cars List which can be scrolled down


## Application Structure
App follows MVVM pattern but without repository as its a single activity simple  App, viewmodel handels data retreival and exposes it to the activity using livedata.data binding is used with binding adapters to dynamically load the data into views.ListAdater is used with diffUtil to load the list more effeciently

## App Views
#### [View number1] MainActivity contains swiperefreshlayout which hosts constraintlayout which has the recyclerview


## Improvement Points
1-writing the app again using kotlin
2-adding unit tests using truth ,espresso
