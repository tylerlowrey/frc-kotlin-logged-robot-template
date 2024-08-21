package frc.robot

import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.Commands

class RobotContainer {
    init {
        configureBindings()
    }

    private fun configureBindings() {}

    val autonomousCommand: Command = Commands.print("No autonomous command configured")
}