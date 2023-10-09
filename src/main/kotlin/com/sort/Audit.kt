package com.sort

import jakarta.persistence.Embeddable
import java.time.Instant

@Embeddable
data class Audit(
    val createdAt: Instant,
    val modifiedAt: Instant
)
