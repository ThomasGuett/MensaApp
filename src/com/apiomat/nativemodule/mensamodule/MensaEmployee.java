/*
 * Copyright (c) 2011 - 2019, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.mensamodule;


import com.apiomat.nativemodule.basics.*;
/**
* Generated default class representing a user in your app
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "MensaModule",
    hooksClassNameTransient = "com.apiomat.nativemodule.mensamodule.MensaEmployeeHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.mensamodule.MensaEmployeeHooksNonTransient", 
    isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.Guest, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class MensaEmployee extends com.apiomat.nativemodule.mensamodule.Employee
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "MensaModule";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "MensaEmployee";

    /** class specific attributes */
    private double[] mensaLocation;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public MensaEmployee ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public double getMensaLocationLatitude( )
    {
         return this.mensaLocation !=null && this.mensaLocation.length > 0 ? this.mensaLocation[0] : 0;
    }

    public double getMensaLocationLongitude( )
    {
         return this.mensaLocation !=null && this.mensaLocation.length > 1 ? this.mensaLocation[1] : 0;
    }

    public void setMensaLocationLatitude( double latitude )
    {
        if( this.mensaLocation == null )
        {
            this.mensaLocation = new double[]{};
        }

        if ( this.mensaLocation.length < 2 )
        {
            this.mensaLocation = new double[]{ latitude, 0 };
        }
        else
        {
            this.mensaLocation[0] = latitude;
        }
    }

    public void setMensaLocationLongitude( double longitude )
    {
        if( this.mensaLocation == null )
        {
            this.mensaLocation = new double[]{};
        }

        if ( this.mensaLocation.length < 2 )
        {
            this.mensaLocation = new double[]{ 0, longitude };
        }
        else
        {
            this.mensaLocation[1] = longitude;
        }
    }

}
