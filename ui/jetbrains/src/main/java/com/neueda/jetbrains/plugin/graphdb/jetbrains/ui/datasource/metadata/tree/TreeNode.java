package com.neueda.jetbrains.plugin.graphdb.jetbrains.ui.datasource.metadata.tree;

import javax.swing.tree.DefaultMutableTreeNode;

public interface TreeNode {

    public String getName();

    public DefaultMutableTreeNode getMutableTreeNode();

}