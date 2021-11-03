package com.ivamotelo.drinkwater.sync

import android.app.IntentService
import android.content.Intent


/**
 * TODO: 004 - Extenda a classe IntentService e no construtor passe o parâmetro com o mesmo nome desta classe
 * "IntentService é uma classe padrão do framework Android, utilizada para iniciar serviços em background
 * TODO: 005 - Sobrescreva o metodo onHandleIntent
 * - Pegue a ação da intent que startou este service
 * - Chame o método DrinkWaterReminderTask.executeTask e passe a action no parâmetro
*/
class DrinkWaterReminderIntentService  : IntentService("DrinkWaterReminderIntentService") {
    override fun onHandleIntent(intent: Intent?) {
        val action = intent?.action

        DrinkWaterReminderTask.executeTask(this, action)
    }
}