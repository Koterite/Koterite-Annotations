package br.com.gamemods.koterite.annotation

import kotlin.RequiresOptIn.Level.WARNING

/**
 * This annotation marks declarations with default parameters that are subject to semantic change without a migration path.
 */
@RequiresOptIn(level = WARNING)
annotation class UnstableDefault
