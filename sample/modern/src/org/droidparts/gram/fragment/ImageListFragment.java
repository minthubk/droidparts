/**
 * Copyright 2012 Alex Yanchenko
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
package org.droidparts.gram.fragment;

import org.droidparts.annotation.inject.InjectParentActivity;
import org.droidparts.fragment.AlterableContent;
import org.droidparts.fragment.ListFragment;
import org.droidparts.gram.adapter.ImageListAdapter;

import android.view.View;
import android.widget.ListView;

public class ImageListFragment extends ListFragment implements
		AlterableContent<ImageListAdapter> {

	public static interface Listener {

		void onShowImageDetail(int position);

	}

	@InjectParentActivity
	private Listener listener;

	@Override
	public void setContent(ImageListAdapter adapter) {
		setListAdapter(adapter);
	}

	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		listener.onShowImageDetail(position);
	}

}
