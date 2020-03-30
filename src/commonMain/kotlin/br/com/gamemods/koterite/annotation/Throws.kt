@file:Suppress("unused")

package br.com.gamemods.koterite.annotation

import kotlin.reflect.KClass

@Target(AnnotationTarget.FUNCTION, AnnotationTarget.CONSTRUCTOR)
@MustBeDocumented
expect annotation class Throws(vararg val exceptionClasses: KClass<out Throwable>)
