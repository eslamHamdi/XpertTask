# Cars App

## Application Description

App uses retrofit as HTTP Client to get a list of car items and view it inside RecyclerView

## How to Run

open Android studio

run the app, it will load cars List which can be scrolled down


## Application Structure
App follows MVVM pattern but without repository as its a single activity simple  App, viewmodel handels data retreival and exposes it to the activity using livedata.data binding is used with binding adapters to dynamically load the data into views.ListAdater is used with diffUtil to load the list more effeciently

## App Views
 MainActivity contains swiperefreshlayout which hosts constraintlayout which has the recyclerview


## Improvement Points
1-writing the app again using kotlin

2-adding unit tests using truth ,espresso
