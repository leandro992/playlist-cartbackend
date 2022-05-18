package com.playlist.aluraflix.repository

import com.playlist.aluraflix.domain.Video
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface VideoRepository : JpaRepository<Video, Long>{

}