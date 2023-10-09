package com.sort

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.UUID

@Repository
interface UsersRepository : JpaRepository<User, UUID> {
}
