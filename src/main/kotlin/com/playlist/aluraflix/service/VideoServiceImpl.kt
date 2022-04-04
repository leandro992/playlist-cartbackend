package com.playlist.aluraflix.service

import com.playlist.aluraflix.domain.Video
import jakarta.inject.Singleton

@Singleton
open class VideoServiceImpl(private val videoService: VideoService) {

    fun findAllVideo(): List<Video> = videoService.allVideo()
}