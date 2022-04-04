package com.playlist.aluraflix.controller

import com.playlist.aluraflix.domain.Video
import com.playlist.aluraflix.service.VideoService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller("/")
class VideoController(private val videoService: VideoService) {

    @Get("video")
    fun allVideo(): HttpResponse<List<Video>> =
        videoService.allVideo()
            .let { HttpResponse.ok<Video?>().body(it) }

}