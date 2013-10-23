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
package fr.tpt.aadl.annex.behavior.aadlba.provider;


import fr.tpt.aadl.annex.behavior.aadlba.AadlBaFactory;
import fr.tpt.aadl.annex.behavior.aadlba.AadlBaPackage;
import fr.tpt.aadl.annex.behavior.aadlba.BehaviorVariableHolder;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.tpt.aadl.annex.behavior.aadlba.BehaviorVariableHolder} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviorVariableHolderItemProvider
  extends DataHolderItemProvider
  implements
    IEditingDomainItemProvider,
    IStructuredItemContentProvider,
    ITreeItemContentProvider,
    IItemLabelProvider,
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BehaviorVariableHolderItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

    }
    return itemPropertyDescriptors;
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
  {
    if (childrenFeatures == null)
    {
      super.getChildrenFeatures(object);
      childrenFeatures.add(AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child)
  {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns BehaviorVariableHolder.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   */
  @Override
  public Object getImage(Object object)
  {
    String imgFile = BehaviorElementItemProvider.IMG_PATH + "variable_16" ;
    return overlayImage(object, getResourceLocator().getImage(imgFile));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object)
  {
    return getString("_UI_BehaviorVariableHolder_type");
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(BehaviorVariableHolder.class))
    {
      case AadlBaPackage.BEHAVIOR_VARIABLE_HOLDER__ARRAY_INDEXES:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createBehaviorBooleanLiteral()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createBehaviorEnumerationLiteral()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createBehaviorIntegerLiteral()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createBehaviorPropertyConstant()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createBehaviorPropertyValue()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createBehaviorRealLiteral()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createBehaviorStringLiteral()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createBehaviorVariableHolder()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createDataAccessHolder()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createDataAccessPrototypeHolder()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createDataComponentReference()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createDataPortHolder()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createDataSubcomponentHolder()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createEventDataPortHolder()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createEventPortHolder()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createFeaturePrototypeHolder()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createIterativeVariableHolder()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createParameterHolder()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createPortCountValue()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createPortDequeueValue()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createPortFreezeAction()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createPortFreshValue()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createPortPrototypeHolder()));

    newChildDescriptors.add
      (createChildParameter
        (AadlBaPackage.Literals.INDEXABLE_ELEMENT__ARRAY_INDEXES,
         AadlBaFactory.eINSTANCE.createStructUnionElementHolder()));
  }

}
