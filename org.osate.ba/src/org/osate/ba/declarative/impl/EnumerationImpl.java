/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2013 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify 
 * it under the terms of the Eclipse Public License as published by Eclipse,
 * either version 1.0 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see 
 * http://www.eclipse.org/org/documents/epl-v10.php
 */

package org.osate.ba.declarative.impl ;


import org.eclipse.emf.common.notify.Notification ;
import org.eclipse.emf.common.notify.NotificationChain ;

import org.eclipse.emf.ecore.EClass ;
import org.eclipse.emf.ecore.InternalEObject ;

import org.eclipse.emf.ecore.impl.ENotificationImpl ;
import org.osate.ba.declarative.DeclarativePackage ;
import org.osate.ba.declarative.Enumeration ;
import org.osate.ba.declarative.Identifier ;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.ba.declarative.impl.EnumerationImpl#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl extends QualifiedNamedElementImpl implements
                                                              Enumeration
{
  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected Identifier literal ;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationImpl()
  {
    super() ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DeclarativePackage.Literals.ENUMERATION ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Identifier getLiteral()
  {
    return literal ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLiteral(Identifier newLiteral,
                                           NotificationChain msgs)
  {
    Identifier oldLiteral = literal ;
    literal = newLiteral ;
    if(eNotificationRequired())
    {
      ENotificationImpl notification =
            new ENotificationImpl(this, Notification.SET,
                  DeclarativePackage.ENUMERATION__LITERAL, oldLiteral,
                  newLiteral) ;
      if(msgs == null)
        msgs = notification ;
      else
        msgs.add(notification) ;
    }
    return msgs ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(Identifier newLiteral)
  {
    if(newLiteral != literal)
    {
      NotificationChain msgs = null ;
      if(literal != null)
        msgs =
              ((InternalEObject) literal)
                    .eInverseRemove(this,
                                    EOPPOSITE_FEATURE_BASE -
                                          DeclarativePackage.ENUMERATION__LITERAL,
                                    null, msgs) ;
      if(newLiteral != null)
        msgs =
              ((InternalEObject) newLiteral)
                    .eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
                                       DeclarativePackage.ENUMERATION__LITERAL,
                                 null, msgs) ;
      msgs = basicSetLiteral(newLiteral, msgs) ;
      if(msgs != null)
        msgs.dispatch() ;
    }
    else if(eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET,
            DeclarativePackage.ENUMERATION__LITERAL, newLiteral, newLiteral)) ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd,
                                          int featureID,
                                          NotificationChain msgs)
  {
    switch ( featureID )
    {
      case DeclarativePackage.ENUMERATION__LITERAL :
        return basicSetLiteral(null, msgs) ;
    }
    return super.eInverseRemove(otherEnd, featureID, msgs) ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID,
                     boolean resolve,
                     boolean coreType)
  {
    switch ( featureID )
    {
      case DeclarativePackage.ENUMERATION__LITERAL :
        return getLiteral() ;
    }
    return super.eGet(featureID, resolve, coreType) ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID,
                   Object newValue)
  {
    switch ( featureID )
    {
      case DeclarativePackage.ENUMERATION__LITERAL :
        setLiteral((Identifier) newValue) ;
        return ;
    }
    super.eSet(featureID, newValue) ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch ( featureID )
    {
      case DeclarativePackage.ENUMERATION__LITERAL :
        setLiteral((Identifier) null) ;
        return ;
    }
    super.eUnset(featureID) ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch ( featureID )
    {
      case DeclarativePackage.ENUMERATION__LITERAL :
        return literal != null ;
    }
    return super.eIsSet(featureID) ;
  }

} //EnumerationImpl
