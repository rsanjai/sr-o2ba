/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the Eclipse Public License as published by Eclipse, either
 * version 1.0 of the License, or (at your option) any later version. This
 * program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse Public License for
 * more details. You should have received a copy of the Eclipse Public License
 * along with this program. If not, see
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
package fr.tpt.aadl.annex.behavior.aadlba.impl;

import fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage;
import fr.tpt.aadl.annex.behavior.aadlba.DataAccessHolder;
import fr.tpt.aadl.annex.behavior.aadlba.SharedDataAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Data Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.tpt.aadl.annex.behavior.aadlba.impl.SharedDataActionImpl#getDataAccess <em>Data Access</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SharedDataActionImpl extends BehaviorElementImpl implements SharedDataAction
{
  /**
   * The cached value of the '{@link #getDataAccess() <em>Data Access</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataAccess()
   * @generated
   * @ordered
   */
  protected DataAccessHolder dataAccess;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SharedDataActionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AadlBaPackage.Literals.SHARED_DATA_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataAccessHolder getDataAccess()
  {
    return dataAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataAccess(DataAccessHolder newDataAccess, NotificationChain msgs)
  {
    DataAccessHolder oldDataAccess = dataAccess;
    dataAccess = newDataAccess;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AadlBaPackage.SHARED_DATA_ACTION__DATA_ACCESS, oldDataAccess, newDataAccess);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataAccess(DataAccessHolder newDataAccess)
  {
    if (newDataAccess != dataAccess)
    {
      NotificationChain msgs = null;
      if (dataAccess != null)
        msgs = ((InternalEObject)dataAccess).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AadlBaPackage.SHARED_DATA_ACTION__DATA_ACCESS, null, msgs);
      if (newDataAccess != null)
        msgs = ((InternalEObject)newDataAccess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AadlBaPackage.SHARED_DATA_ACTION__DATA_ACCESS, null, msgs);
      msgs = basicSetDataAccess(newDataAccess, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AadlBaPackage.SHARED_DATA_ACTION__DATA_ACCESS, newDataAccess, newDataAccess));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AadlBaPackage.SHARED_DATA_ACTION__DATA_ACCESS:
        return basicSetDataAccess(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AadlBaPackage.SHARED_DATA_ACTION__DATA_ACCESS:
        return getDataAccess();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AadlBaPackage.SHARED_DATA_ACTION__DATA_ACCESS:
        setDataAccess((DataAccessHolder)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AadlBaPackage.SHARED_DATA_ACTION__DATA_ACCESS:
        setDataAccess((DataAccessHolder)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AadlBaPackage.SHARED_DATA_ACTION__DATA_ACCESS:
        return dataAccess != null;
    }
    return super.eIsSet(featureID);
  }

} //SharedDataActionImpl
