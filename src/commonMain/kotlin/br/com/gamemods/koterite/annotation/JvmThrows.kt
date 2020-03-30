@file:Suppress("unused")

package br.com.gamemods.koterite.annotation

import kotlin.reflect.KClass

@Target(AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER)
@MustBeDocumented
@OptionalExpectation
expect annotation class JvmThrows(vararg val exceptionClasses: KClass<out Throwable>)
