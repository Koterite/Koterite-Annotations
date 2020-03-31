package br.com.gamemods.koterite.annotation

/**
 * API marked with this annotation is koterite internal and it is not intended to be used outside.
 * It could be modified or removed without any notice. Using it outside of koterite could cause undefined behaviour and/or
 * any strange effects.
 *
 * We are strongly recommend to not use such API.
 */
@RequiresOptIn(
    level = RequiresOptIn.Level.ERROR,
    message = "This API is internal in koterite and should not be used. It could be removed or changed without notice."
)
@Target(
    AnnotationTarget.CLASS,
    AnnotationTarget.TYPEALIAS,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.FIELD,
    AnnotationTarget.CONSTRUCTOR
)
annotation class InternalApi
