package com.github.hiygabo.tourguide.schedule.repositories

import com.github.hiygabo.tourguide.schedule.entities.Schedule
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ScheduleRepository : JpaRepository<Schedule, Long> {

}