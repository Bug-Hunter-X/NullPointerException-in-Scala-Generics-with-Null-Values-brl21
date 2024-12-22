# NullPointerException in Scala Generics
This repository demonstrates a common issue encountered when working with generics and null values in Scala.  Specifically, it shows how a `NullPointerException` can occur at runtime when a null value is passed to a generic type parameter, despite the code compiling successfully.

The `bug.scala` file contains the problematic code. The `bugSolution.scala` file provides a solution to mitigate this issue.

## Problem
The `MyClass` class uses generics to handle different data types. When an instance of `MyClass` is created with a null value, calling the `printValue()` method throws a `NullPointerException` because the `println` method tries to handle a null value that it cannot process.

## Solution
The solution involves adding a check for null values before printing or using the generic type. This prevents the `NullPointerException` by handling the null case gracefully.