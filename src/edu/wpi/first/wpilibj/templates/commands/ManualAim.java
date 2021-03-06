/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;
import edu.wpi.first.wpilibj.templates.OI;


/**
 *
 * @author Jon Buckley
 */
public class ManualAim extends CommandBase
{

    public ManualAim()
    {
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
    }

    // Called repeatedly when this Command is scheduled to run

    /*
     * Repeatedly obtains the Shooter Joystick's values and adjusts the shooter;
     * if the trigger is pulled, it shoots the ball
     */
    protected void execute() 
    {
        shooter.setAngle(OI.shooterJoystick.getY());

        if (OI.shooterJoystick.getTrigger())
            shooter.shoot(1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
        return;
    }
}