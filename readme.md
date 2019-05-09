# TDD workshop

## What I know

Test Driven Development

You got tests driving your development... test first... then the code that should be tested.

I helps with:

* thinking about the code
* thinking about what is needed
* how can I achieve what is needed...

## Questions

When are writing tests:

* You are publishing your intent for the code.
* You are stating what the code is doing and how it should behave.

Why do I need to use TDD? - `lunga`

* It helps you to learn how to write decoupled code.
* Learn how to create code `blocks` that can be used together to create more maintainable software.
* Help us not to be afraid to make changes in our codebase.
* It's a way of understanding other people's (you 4 weeks ago) thoughts about the code.

How does TDD make my code better? - `lihle`

* It `decouples` your code - it drives the seperation of concerns.
* It drives the `architecture` / `structure` of your codebase...
	* How the various pieces of code relate to each other.

How does it help me? - `lunga`

What is Mockito? - `shawn/minenhle`

* It helps us to create mocks of interfaces - a thing that is not the actual thing. It looks like the actual thing...
* It can create a 'silent' mock - it doesn't fail but doesn't do much.
* You can add selected behaviour using `when`
* You can verify that that Mock was used correctly using `verify`


How does one know if a class is not testable? - `bheki`

* I can't write a test for it:
	* I can't check the result of an action
	* I can't verify if something happened that should have happened
	* The logic is too `intertwined`...

How does one know if a class is testable? - `bheki`



How do I unit test my classes? - `lihle`

Is there and alternative to unit testing to improve our code? - `bheki`

How would I write a test for code that doesn't exist yet? - `lunga`

How do I unit test my classes that is using the database? - `phumlani`

Can you unit test without hard coding an expected a result? - `minenhle`

How do I unit test my commands?

```java

assertEquals("Hello, Andre", commandProc.execute("greet Andre English"));
assertEquals("Hello, Andre", commandProc.execute("greet Andre"));

```

How do I prepare the data in my database so that the unit test will work correctly as it depends on some existing data in the database? - `shawn`
