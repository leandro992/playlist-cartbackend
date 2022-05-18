package com.playlist.aluraflix.controller

import com.playlist.aluraflix.domain.Video
import com.playlist.aluraflix.service.VideoService
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post


@Controller("/video")
open class VideoController(val videoService: VideoService) {

    @Get
    fun allVideo(): HttpResponse<List<Video>> =
        videoService.allVideo()
            .let { HttpResponse.ok<Video?>().body(it) }


    @Post
    fun saveVideo(@Body video: Video): HttpResponse<Video> =
        videoService.save(video)
            .let { HttpResponse.ok(it) }

}