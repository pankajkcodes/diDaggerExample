package com.pankajkcodes.didaggerexample

import dagger.Component


@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService

    fun getEmailServices(): EmailService
}