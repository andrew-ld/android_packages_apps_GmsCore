/*
 * Copyright (C) 2013-2017 microG Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gms.cast.framework.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ICastConnectionController;
import com.google.android.gms.cast.framework.ICastContext;
import com.google.android.gms.cast.framework.ICastSession;
import com.google.android.gms.cast.framework.IReconnectionService;
import com.google.android.gms.cast.framework.ISession;
import com.google.android.gms.cast.framework.ISessionManager;
import com.google.android.gms.cast.framework.ISessionManagerListener;
import com.google.android.gms.cast.framework.ISessionProxy;
import com.google.android.gms.cast.framework.IAppVisibilityListener;
import com.google.android.gms.cast.framework.ICastStateListener;
import com.google.android.gms.cast.framework.IDiscoveryManager;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.IMediaNotificationService;
import com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask;
import com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

import java.util.Map;

public class CastDynamiteModuleImpl extends ICastDynamiteModule.Stub {
    private static final String TAG = CastDynamiteModuleImpl.class.getSimpleName();

    @Override
    public ICastContext newCastContextImpl(IObjectWrapper context, CastOptions options, IMediaRouter router, Map map) throws RemoteException {
        Log.d(TAG, "unimplemented Method: newCastContextImpl");
        return new ICastContext.Stub() {

            @Override
            public IDiscoveryManager getDiscoveryManagerImpl() throws RemoteException {
                Log.d(TAG, "unimplemented Method: getDiscoveryManagerImpl");
		return null;
            }

            @Override
            public ISessionManager getSessionManagerImpl() throws RemoteException {
                Log.d(TAG, "unimplemented Method: getSessionManagerImpl");
		return null;
            }

            @Override
            public Bundle getMergedSelectorAsBundle() throws RemoteException {
                Log.d(TAG, "unimplemented Method: getMergedSelectorAsBundle");
                return new Bundle();
            }

            @Override
            public IObjectWrapper getWrappedThis() throws RemoteException {
                Log.d(TAG, "unimplemented Method: getWrappedThis");
                return ObjectWrapper.wrap(this);
            }

            @Override
            public boolean isApplicationVisible() throws RemoteException {
                Log.d(TAG, "unimplemented Method: isApplicationVisible");
                return true;
            }

            @Override
            public void addVisibilityChangeListener(IAppVisibilityListener a) throws RemoteException {
                Log.d(TAG, "unimplemented Method: addVisibilityChangeListener");
            }

            @Override
            public void removeVisibilityChangeListener(IAppVisibilityListener a) throws RemoteException {
                Log.d(TAG, "unimplemented Method: removeVisibilityChangeListener");
            }

            public ISessionManager getSessionManager() throws RemoteException {
                Log.d(TAG, "unimplemented Method: getSessionManager");
                return new ISessionManager.Stub(){
                    @Override
                    public IObjectWrapper getWrappedCurrentSession() throws RemoteException {
                        Log.d(TAG, "unimplemented Method: getWrappedCurrentSession");
                        return ObjectWrapper.wrap(null);
                    }

                    @Override
                    public void addCastStateListener(ICastStateListener a) throws RemoteException {
                        Log.d(TAG, "unimplemented Method: addCastStateListener");
                    }

                    @Override
                    public void removeCastStateListener(ICastStateListener a) throws RemoteException {
                        Log.d(TAG, "unimplemented Method: removeCastStateListener");
                    }

                    @Override
                    public void addSessionManagerListener(ISessionManagerListener a) throws RemoteException {
                        Log.d(TAG, "unimplemented Method: addSessionManagerListener");
                    }

                    @Override
                    public void removeSessionManagerListener(ISessionManagerListener a) throws RemoteException {
                        Log.d(TAG, "unimplemented Method: removeSessionManagerListener");
                    }

                    @Override
                    public void endCurrentSession(boolean b, boolean stopCasting) throws RemoteException {
                        Log.d(TAG, "unimplemented Method: endCurrentSession");
                    }

                    @Override
                    public int getCastState() throws RemoteException {
                        Log.d(TAG, "unimplemented Method: getCastState");
			return 0;
                    }

                    @Override
                    public IObjectWrapper getWrappedThis() throws RemoteException {
                        Log.d(TAG, "unimplemented Method: getWrappedThis");
                        return ObjectWrapper.wrap(this);
                    }

                    @Override
                    public void startSession(Bundle a) throws RemoteException {
                        Log.d(TAG, "unimplemented Method: startSession");
                    }


                };
            }

            @Override
            public void destroy() throws RemoteException {
                Log.d(TAG, "unimplemented Method: destroy");

            }

            @Override
            public void onActivityResumed(IObjectWrapper activity) throws RemoteException {
                Log.d(TAG, "unimplemented Method: onActivityResumed");

            }

            @Override
            public void onActivityPaused(IObjectWrapper activity) throws RemoteException {
                Log.d(TAG, "unimplemented Method: onActivityPaused");

            }

            @Override
            public void setReceiverApplicationId(String a, Map b) throws RemoteException {
                Log.d(TAG, "unimplemented Method: setReceiverApplicationId");
            }
        };
    }

    @Override
    public ISession newSessionImpl(String s1, String s2, ISessionProxy proxy) throws RemoteException {
        Log.d(TAG, "unimplemented Method: newSessionImpl");
        return new ISession.Stub() {

             @Override
             public String getCategory() throws RemoteException {
                 Log.d(TAG, "unimplemented Method: getCategory");
                 return "";
             }

             @Override
             public String getSessionId() throws RemoteException {
                 Log.d(TAG, "unimplemented Method: getSessionId");
                 return "";
             }

             @Override
             public void notifyFailedToResumeSession(int error) throws RemoteException {
                 Log.d(TAG, "unimplemented Method: notifyFailedToResumeSession");
             }

             @Override
             public void notifyFailedToStartSession(int error) throws RemoteException {
                 Log.d(TAG, "unimplemented Method: notifyFailedToStartSession");
             }

             @Override
             public void notifySessionEnded(int error) throws RemoteException {
                 Log.d(TAG, "unimplemented Method: notifySessionEnded");
             }

             @Override
             public void notifySessionResumed(boolean wasSuspended) throws RemoteException {
                 Log.d(TAG, "unimplemented Method: notifySessionResumed");
             }

             @Override
             public void notifySessionStarted(String sessionId) throws RemoteException {
                 Log.d(TAG, "unimplemented Method: notifySessionStarted");
             }

             @Override
             public void notifySessionSuspended(int reason) throws RemoteException {
                 Log.d(TAG, "unimplemented Method: notifySessionSuspended");
             }

             @Override
             public boolean isConnected() throws RemoteException {
                 Log.d(TAG, "unimplemented Method: isConnected");
                 return false;
             }

             @Override
             public boolean isConnecting() throws RemoteException {
                 Log.d(TAG, "unimplemented Method: isConnecting");
                 return false;
             }

             @Override
             public boolean isDisconnected() throws RemoteException {
                 Log.d(TAG, "unimplemented Method: isDisconnected");
                 return false;
             }

             @Override
             public boolean isDisconnecting() throws RemoteException {
                 Log.d(TAG, "unimplemented Method: isDisconnecting");
                 return false;
             }

             @Override
             public boolean isSuspended() throws RemoteException {
                 Log.d(TAG, "unimplemented Method: isSuspended");
		 return false;
             }

             @Override
             public boolean isResuming() throws RemoteException {
                 Log.d(TAG, "unimplemented Method: isResuming");
                 return false;
             }

             @Override
             public IObjectWrapper getWrappedObject() throws RemoteException {
                 Log.d(TAG, "unimplemented Method: getWrappedObject");
                 return ObjectWrapper.wrap(this);
             }
        };
    }

    @Override
    public ICastSession newCastSessionImpl(CastOptions options, IObjectWrapper session, ICastConnectionController controller) throws RemoteException {
        Log.d(TAG, "unimplemented Method: newCastSessionImpl");
        return new ICastSession.Stub() {
        };
    }

    @Override
    public IMediaNotificationService newMediaNotificationServiceImpl(IObjectWrapper service, IObjectWrapper castContext, IObjectWrapper resources, CastMediaOptions options) throws RemoteException {
        Log.d(TAG, "unimplemented Method: newMediaNotificationServiceImpl");
        return new IMediaNotificationService.Stub() {
        };
    }

    @Override
    public IReconnectionService newReconnectionServiceImpl(IObjectWrapper service, IObjectWrapper sessionManager, IObjectWrapper discoveryManager) throws RemoteException {
        Log.d(TAG, "unimplemented Method: newReconnectionServiceImpl");
        return new IReconnectionService.Stub() {
        };
    }

    @Override
    public IFetchBitmapTask newFetchBitmapTaskImpl(IObjectWrapper asyncTask, IFetchBitmapTaskProgressPublisher progressPublisher, int i1, int i2, boolean b1, long l1, int i3, int i4, int i5) throws RemoteException {
        Log.d(TAG, "unimplemented Method: newFetchBitmapTaskImpl");
        return new IFetchBitmapTask.Stub() {
        };
    }
}
