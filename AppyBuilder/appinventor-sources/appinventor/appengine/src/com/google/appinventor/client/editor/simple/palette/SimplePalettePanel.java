// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2016-2018 AppyBuilder.com, All Rights Reserved - Info@AppyBuilder.com
// https://www.gnu.org/licenses/gpl-3.0.en.html

// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.client.editor.simple.palette;

import com.google.appinventor.client.editor.simple.components.MockComponent;

/**
 * An interface that a palette can implement in order to support showing Simple
 * components which can be dropped onto a visual designer panel.
 *
 * @author lizlooney@google.com (Liz Looney)
 */
public interface SimplePalettePanel {
  /**
   * Loads all components to be shown on the palette.
   *
   * @param dropTargetProvider  provider of targets that palette items can be
   *                            dropped on
   */
  void loadComponents(DropTargetProvider dropTargetProvider);

  /**
   * Configure a mock component.
   *
   * @param mockComponent  mock component to configure
   */
  void configureComponent(MockComponent mockComponent);

  void addComponent(String componentTypeName);

  void clearComponents();

  void reloadComponents();
}