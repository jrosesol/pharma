/**
 * 
 */
package com.pharma.is.server.handler;

import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.shared.ActionException;
import com.pharma.is.shared.action.GenericAction;
import com.pharma.is.shared.action.GenericAction.GenericResult;

/**
 * @author JROSE-HP
 *
 */
public class GetUUIDHandler extends GenericHandler<GenericAction, GenericAction.GenericResult> {

  @Override
  public GenericResult execute(GenericAction action, ExecutionContext context)
      throws ActionException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Class<GenericAction> getActionType() {
    return GenericAction.class;
  }

  @Override
  public void undo(GenericAction action, GenericResult result,
      ExecutionContext context) throws ActionException {
    // TODO Auto-generated method stub
    
  }

}
