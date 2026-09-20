package com.github.hiygabo.tourguide.schedule.controllers

import com.github.hiygabo.tourguide.schedule.entities.Schedule
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.github.hiygabo.tourguide.schedule.services.ScheduleService
import org.springframework.web.bind.annotation.GetMapping

@RestController
@RequestMapping("/schedule")
class ScheduleController (
    val scheduleService: ScheduleService
){
    @GetMapping
    fun getSchedules(): List<Schedule>{
        return scheduleService.getSchedules()
    }
}