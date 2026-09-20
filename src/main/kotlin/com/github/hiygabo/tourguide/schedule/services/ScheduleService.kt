package com.github.hiygabo.tourguide.schedule.services

import org.springframework.stereotype.Service
import com.github.hiygabo.tourguide.schedule.repositories.ScheduleRepository
import com.github.hiygabo.tourguide.schedule.entities.Schedule
@Service
class ScheduleService(
    private val scheduleRepository: ScheduleRepository
) {

    fun getSchedules(): List<Schedule> {
        return scheduleRepository.findAll()
    }

}