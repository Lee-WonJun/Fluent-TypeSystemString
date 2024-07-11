# Fluent?TypeSystemString

Welcome to **Fluent?TypeSystemString**! 🎉

Ever felt like handling strings in Kotlin is too boring or cumbersome? Don't worry, be happy! We finally made string manipulation ultra safe and fun!


![2024-07-11220610-ezgif com-video-to-gif-converter](https://github.com/Lee-WonJun/Fluent-TypeSystemString/assets/10369528/e9c1affa-5d69-417b-85f8-82f01e313c3b)

## Description

A Kotlin library that makes string manipulation fun and type-safe through a fluent interface. Build and combine strings easily with type safety guaranteed.

## Key Features

- **String Composition**: Use objects for each letter and special character to build and combine strings.
- **Type Safety**: Enjoy safe and clear string manipulation with Kotlin's type system.
- **Special Characters**: Seamlessly add `!`, `?`, spaces, and more.

## Installation

Are you seriously trying to install this? Get a grip! 😊

## Usage

### Basic Example

```kotlin
val hello = STRING.H.E.L.L.O
val world = STRING.W.O.R.L.D
val combined = hello + world
println(combined)  // Output: HELLO WORLD
```

```
val excited = STRING.H.E.L.L.O.`__`.W.`_`.O.`_`.R.`_`.L.`_`.D.`_`.`!`
println(excited)  // Output: HELLO W_O_R_L_D_!
```
