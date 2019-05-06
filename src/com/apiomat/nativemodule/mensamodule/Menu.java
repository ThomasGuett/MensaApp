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
* Generated class for your Menu data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "MensaModule",
    hooksClassNameTransient = "com.apiomat.nativemodule.mensamodule.MenuHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.mensamodule.MenuHooksNonTransient", 
    isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.AppAdmin, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.Guest,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.AppAdmin, restrictResourceAccess=false,    allowedRolesCreate={"mensaEmployee"}, allowedRolesRead={},
    allowedRolesWrite={"mensaEmployee"}, allowedRolesGrant={}, 
    roleClassesMap={})
public class Menu extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.mensamodule.Menu> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.mensamodule.Menu>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "MensaModule";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Menu";

    /** class specific attributes */
    private java.util.Date availableAt = null;
    private java.util.List<String> ingredients = new java.util.ArrayList<>();
    private String name = null;
    @com.apiomat.nativemodule.StaticData( type = com.apiomat.nativemodule.StaticData.Type.Image )
    private String pictureURL;
    private Double price = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Menu ()
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

    public java.util.Date getAvailableAt()
    {
         return this.availableAt;
    }

    public void setAvailableAt( java.util.Date arg )
    {
        this.availableAt = arg;
    }

    @SuppressWarnings( "unchecked" )
    public java.util.List<String> getIngredients()
    {
         return this.ingredients;
    }

    public void setIngredients( java.util.List<String> arg )
    {
        this.ingredients = arg;
    }

    public String getName()
    {
         return this.name;
    }

    public void setName( String arg )
    {
        this.name = arg;
    }

    public String getPictureURL( )
    {
        return this.pictureURL;
    }

    public byte[] loadPicture( )
    {
        final String resUrl = getPictureURL();
        return getData( com.apiomat.nativemodule.IResourceMethods.ResourceType.IMAGE, resUrl);
    }

    public java.io.InputStream loadPictureAsStream( )
    {
        final String resUrl = getPictureURL();
        return getDataAsStream( com.apiomat.nativemodule.IResourceMethods.ResourceType.IMAGE, resUrl);
    }

    public String getPictureURL( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final java.lang.StringBuilder additionalParameters = new java.lang.StringBuilder();
        additionalParameters.append( ".img?apiKey=" );
        additionalParameters.append( apiKey );
        additionalParameters.append( "&system=" );
        additionalParameters.append( system );
        additionalParameters.append( "&width=" );
        additionalParameters.append( width );
        additionalParameters.append( "&height=" );
        additionalParameters.append( height );
        
        if(backgroundColorAsHex != null) 
        {
            additionalParameters.append( "&bgcolor=" );
            additionalParameters.append( backgroundColorAsHex );
        }
        if(alpha != null)
        {
            additionalParameters.append( "&alpha=" );
            additionalParameters.append( alpha );
        }
        if(format != null)
        {
            additionalParameters.append( "&format=" );
            additionalParameters.append( format );
        }
        return getPictureURL( ) + additionalParameters;
    }

    public byte[] loadPicture( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final String resUrl = getPictureURL( apiKey, system, width, height, 
            backgroundColorAsHex, alpha, format );
        return loadResource(resUrl);
    }

    public void setPictureURL( String url ) 
    {
        this.pictureURL = url;
    }

    /**
     * @deprecated Use {@link #postPicture( java.io.InputStream data , String fileName, String format )}
     */
    @Deprecated
    public String postPicture( byte[] data , String fileName, String format )
    {
        String url = saveResource( data, true, fileName, format );
        setPictureURL( url );
        return url;
    }

    public String postPicture( java.io.InputStream data , String fileName, String format )
    {
        String url = saveResource( data, true, fileName, format );
        setPictureURL( url );
        return url;
    }

    public Double getPrice()
    {
         return this.price;
    }

    public void setPrice( Double arg )
    {
        this.price = arg;
    }

}
