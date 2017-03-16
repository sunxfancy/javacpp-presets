/*
 * Copyright (C) 2015 Samuel Audet
 *
 * Licensed either under the Apache License, Version 2.0, or (at your option)
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation (subject to the "Classpath" exception),
 * either version 2, or any later version (collectively, the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     http://www.gnu.org/licenses/
 *     http://www.gnu.org/software/classpath/license.html
 *
 * or as provided in the LICENSE.txt file that accompanied this code.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bytedeco.javacpp.presets;

import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(target = "org.bytedeco.javacpp.ogre4j", value = @Platform(value = {"linux-x86", "linux-x86_64", "macosx"},
	include = {
	"OgreHeader.hpp"
},
	link = "OgreMain"))
public class ogre4j implements InfoMapper {
	public void map(InfoMap infoMap) {
		infoMap
			// Iterator names
			.put(new Info("Ogre::ConstMapIterator<Ogre::NumericTrackList>").cast().pointerTypes("NumericTrackIteratorRef"))
			.put(new Info("Ogre::ConstMapIterator<Ogre::NumericTrackList>::type").cast().pointerTypes("NumericTrackIteratorRef"))
			.put(new Info("Ogre::ConstMapIterator<Ogre::OldNodeTrackList>").cast().pointerTypes("OldNodeTrackIteratorRef"))
			.put(new Info("Ogre::ConstMapIterator<Ogre::OldNodeTrackList>::type").cast().pointerTypes("OldNodeTrackIteratorRef"))
			.put(new Info("Ogre::ConstMapIterator<Ogre::VertexTrackList>").cast().pointerTypes("VertexTrackIteratorRef"))
			.put(new Info("Ogre::ConstMapIterator<Ogre::VertexTrackList>::type").cast().pointerTypes("VertexTrackIteratorRef"))
			.put(new Info("Ogre::ConstVectorIterator<Ogre::NodeTrackList>").cast().pointerTypes("NodeTrackIteratorRef"))
			.put(new Info("Ogre::ConstVectorIterator<Ogre::NodeTrackList>::type").cast().pointerTypes("NodeTrackIteratorRef"))
			.put(new Info("Ogre::MapIterator<Ogre::AnimationStateMap>").cast().pointerTypes("AnimationStateMapIteratorRef"))
			.put(new Info("Ogre::MapIterator<Ogre::AnimationStateMap>::type").cast().pointerTypes("AnimationStateMapIteratorRef"))
			.put(new Info("Ogre::MapIterator<Ogre::ArchiveManager::ArchiveMap>").cast().pointerTypes("ArchiveMapIteratorRef"))
			.put(new Info("Ogre::MapIterator<Ogre::ArchiveManager::ArchiveMap>::type").cast().pointerTypes("ArchiveMapIteratorRef"))
			.put(new Info("Ogre::MapIterator<Ogre::ConfigFile::SettingsBySection>").cast().pointerTypes("SettingsBySectionIteratorRef"))
			.put(new Info("Ogre::MapIterator<Ogre::ConfigFile::SettingsBySection>::type").cast().pointerTypes("SettingsBySectionIteratorRef"))
			.put(new Info("Ogre::MapIterator<Ogre::ConfigFile::SettingsMultiMap>").cast().pointerTypes("SettingsMultiMapIteratorRef"))
			.put(new Info("Ogre::MapIterator<Ogre::ConfigFile::SettingsMultiMap>::type").cast().pointerTypes("SettingsMultiMapIteratorRef"))
			.put(new Info("Ogre::VectorIterator<Ogre::Material::Techniques>").cast().pointerTypes("TechniquesVectorIteratorRef"))
			.put(new Info("Ogre::VectorIterator<Ogre::v1::VertexPoseKeyFrame::PoseRefList>").cast().pointerTypes("PoseRefListVectorIteratorRef"))

			// Iterator define
			.put(new Info("Ogre::VectorIteratorWrapper<Ogre::Material::Techniques,Ogre::Material::Techniques::iterator>").cast().pointerTypes("TechniquesVectorIteratorWrapperRef").define())
			.put(new Info("Ogre::VectorIteratorWrapper<Ogre::v1::VertexPoseKeyFrame::PoseRefList,Ogre::v1::VertexPoseKeyFrame::PoseRefList::iterator>").cast().pointerTypes("PoseRefListVectorIteratorRef").define())
			.put(new Info("Ogre::VectorIteratorWrapper<Ogre::NodeTrackList,Ogre::NodeTrackList::const_iterator>").cast().pointerTypes("NodeTrackIteratorRef").define())
			.put(new Info("Ogre::MapIteratorWrapper<Ogre::AnimationStateMap,Ogre::AnimationStateMap::iterator>").cast().pointerTypes("AnimationStateMapIteratorRef").define())
			.put(new Info("Ogre::MapIteratorWrapper<Ogre::ArchiveManager::ArchiveMap,Ogre::ArchiveManager::ArchiveMap::iterator>").cast().pointerTypes("ArchiveMapIteratorRef").define())
			.put(new Info("Ogre::MapIteratorWrapper<Ogre::ConfigFile::SettingsBySection,Ogre::ConfigFile::SettingsBySection::iterator>").cast().pointerTypes("SettingsBySectionIteratorRef").define())
			.put(new Info("Ogre::MapIteratorWrapper<Ogre::ConfigFile::SettingsMultiMap,Ogre::ConfigFile::SettingsMultiMap::iterator>").cast().pointerTypes("SettingsMultiMapIteratorRef").define())
			.put(new Info("Ogre::MapIteratorWrapper<Ogre::NumericTrackList,Ogre::NumericTrackList::const_iterator>").cast().pointerTypes("NumericTrackIteratorRef").define())
			.put(new Info("Ogre::MapIteratorWrapper<Ogre::OldNodeTrackList,Ogre::OldNodeTrackList::const_iterator>").cast().pointerTypes("OldNodeTrackIteratorRef").define())
			.put(new Info("Ogre::MapIteratorWrapper<Ogre::VertexTrackList,Ogre::VertexTrackList::const_iterator>").cast().pointerTypes("VertexTrackIteratorRef").define())

			// Iterator base define
			.put(new Info("Ogre::IteratorWrapper<Ogre::Material::Techniques,Ogre::Material::Techniques::iterator,Ogre::Material::Techniques::value_type>").cast().pointerTypes("TechniquesVectorIteratorWrapperBaseRef").define())
			.put(new Info("Ogre::IteratorWrapper<Ogre::v1::VertexPoseKeyFrame::PoseRefList,Ogre::v1::VertexPoseKeyFrame::PoseRefList::iterator,Ogre::v1::VertexPoseKeyFrame::value_type>").cast().pointerTypes("PoseRefListVectorIteratorBaseRef").define())
			.put(new Info("Ogre::IteratorWrapper<Ogre::NodeTrackList,Ogre::NodeTrackList::const_iterator,Ogre::NodeTrackList,Ogre::value_type>").cast().pointerTypes("NodeTrackIteratorBaseRef").define())
			.put(new Info("Ogre::IteratorWrapper<Ogre::AnimationStateMap,Ogre::AnimationStateMap::iterator,Ogre::AnimationStateMap,Ogre::value_type>").cast().pointerTypes("AnimationStateMapIteratorBaseRef").define())
			.put(new Info("Ogre::IteratorWrapper<Ogre::ArchiveManager::ArchiveMap,Ogre::ArchiveManager::ArchiveMap::iterator,Ogre::ArchiveManager::ArchiveMap::value_type>").cast().pointerTypes("ArchiveMapIteratorBaseRef").define())
			.put(new Info("Ogre::IteratorWrapper<Ogre::ConfigFile::SettingsBySection,Ogre::ConfigFile::SettingsBySection::iterator,Ogre::ConfigFile::SettingsBySection::value_type>").cast().pointerTypes("SettingsBySectionIteratorBaseRef").define())
			.put(new Info("Ogre::IteratorWrapper<Ogre::ConfigFile::SettingsMultiMap,Ogre::ConfigFile::SettingsMultiMap::iterator,Ogre::ConfigFile::SettingsMultiMap::value_type>").cast().pointerTypes("SettingsMultiMapIteratorBaseRef").define())
			.put(new Info("Ogre::IteratorWrapper<Ogre::NumericTrackList,Ogre::NumericTrackList::const_iterator,Ogre::NumericTrackList,Ogre::value_type>").cast().pointerTypes("NumericTrackIteratorBaseRef").define())
			.put(new Info("Ogre::IteratorWrapper<Ogre::OldNodeTrackList,Ogre::OldNodeTrackList::const_iterator,Ogre::OldNodeTrackList,Ogre::value_type>").cast().pointerTypes("OldNodeTrackIteratorBaseRef").define())
			.put(new Info("Ogre::IteratorWrapper<Ogre::VertexTrackList,Ogre::VertexTrackList::const_iterator,Ogre::VertexTrackList,Ogre::value_type>").cast().pointerTypes("VertexTrackIteratorBaseRef").define())

			// FastArray
			.put(new Info("Ogre::FastArray<Ogre::Ogre::Real>").cast().pointerTypes("RealFastArrayRef").define())
			.put(new Info("Ogre::FastArray<Ogre::Real>").cast().pointerTypes("RealFastArrayRef"))
			.put(new Info("FastArray<Ogre::Real>::type").cast().pointerTypes("RealFastArrayRef").define())
			.put(new Info("Ogre::FastArray<Ogre::SkeletonInstance*>").cast().pointerTypes("SkeletonInstancePtrFastArrayRef").define())
			.put(new Info("FastArray<Ogre::SkeletonInstance*>::type").cast().pointerTypes("SkeletonInstancePtrFastArrayRef").define())
			.put(new Info("Ogre::FastArray<size_t>").cast().pointerTypes("SizeFastArrayRef").define())
			.put(new Info("FastArray<size_t>::type").cast().pointerTypes("SizeFastArrayRef").define())
			.put(new Info("Ogre::FastArray<unsigned char>").cast().pointerTypes("ByteFastArrayRef").define())
			.put(new Info("FastArray<unsigned char>::type").cast().pointerTypes("ByteFastArrayRef").define())
			.put(new Info("Ogre::FastArray<unsigned short>").cast().pointerTypes("UshortFastArrayRef").define())
			.put(new Info("FastArray<unsigned short>::type").cast().pointerTypes("UshortFastArrayRef").define())

			// STL class
			.put(new Info("std::hash<Ogre::_StringBase>").cast().pointerTypes("StringBaseHashRef").define())
			.put(new Info("hash<Ogre::_StringBase>::type").cast().pointerTypes("StringBaseHashRef").define())
			.put(new Info("std::list<Ogre::BySkeletonDef>").cast().pointerTypes("BySkeletonDefListRef").define())
			.put(new Info("list<Ogre::BySkeletonDef>::type").cast().pointerTypes("BySkeletonDefListRef").define())
			.put(new Info("std::list<Ogre::MovableObject*>").cast().pointerTypes("MovableObjectPtrListRef").define())
			.put(new Info("list<Ogre::MovableObject*>::type").cast().pointerTypes("MovableObjectPtrListRef").define())
			.put(new Info("std::list<Ogre::Plane>").cast().pointerTypes("PlaneListRef").define())
			.put(new Info("list<Ogre::Plane>::type").cast().pointerTypes("PlaneListRef").define())
			.put(new Info("std::list<Ogre::ResourceGroupManager::ResourceDeclaration>").cast().pointerTypes("ResourceDeclarationListRef").define())
			.put(new Info("list<Ogre::ResourceGroupManager::ResourceDeclaration>::type").cast().pointerTypes("ResourceDeclarationListRef").define())
			.put(new Info("std::list<Ogre::ResourceGroupManager::ResourceLocation*>").cast().pointerTypes("ResourceLocationPtrListRef").define())
			.put(new Info("list<Ogre::ResourceGroupManager::ResourceLocation*>::type").cast().pointerTypes("ResourceLocationPtrListRef").define())
			.put(new Info("std::list<Ogre::SceneQuery::WorldFragment*>").cast().pointerTypes("WorldFragmentPtrListRef").define())
			.put(new Info("list<Ogre::SceneQuery::WorldFragment*>::type").cast().pointerTypes("WorldFragmentPtrListRef").define())
			.put(new Info("std::list<Ogre::SceneQueryMovableObjectPair>").cast().pointerTypes("SceneQueryMovableObjectPairListRef").define())
			.put(new Info("list<Ogre::SceneQueryMovableObjectPair>::type").cast().pointerTypes("SceneQueryMovableObjectPairListRef").define())
			.put(new Info("std::list<Ogre::SceneQueryMovableObjectWorldFragmentPair>").cast().pointerTypes("SceneQueryMovableObjectWorldFragmentPairListRef").define())
			.put(new Info("list<Ogre::SceneQueryMovableObjectWorldFragmentPair>::type").cast().pointerTypes("SceneQueryMovableObjectWorldFragmentPairListRef").define())
			.put(new Info("std::list<Ogre::v1::VertexElement>").cast().pointerTypes("VertexElementListRef").define())
			.put(new Info("list<Ogre::v1::VertexElement>::type").cast().pointerTypes("VertexElementListRef").define())
			.put(new Info("std::map<Ogre::RenderTarget*,Ogre::ResourceAccess::ResourceAccess>").cast().pointerTypes("ResourceAccessRenderTargetPtrRef").define())
			.put(new Info("map<Ogre::RenderTarget*,Ogre::ResourceAccess::ResourceAccess>::type").cast().pointerTypes("ResourceAccessRenderTargetPtrRef").define())
			.put(new Info("std::map<Ogre::RenderTarget*,Ogre::ResourceLayout::Layout>").cast().pointerTypes("LayoutRenderTargetPtrRef").define())
			.put(new Info("map<Ogre::RenderTarget*,Ogre::ResourceLayout::Layout>::type").cast().pointerTypes("LayoutRenderTargetPtrRef").define())
			.put(new Info("std::map<Ogre::String,bool>").cast().pointerTypes("SBoolUMapRef").define())
			.put(new Info("map<Ogre::String,bool>::type").cast().pointerTypes("SBoolUMapRef").define())
			.put(new Info("std::map<Ogre::String,Ogre::ConfigOption>").cast().pointerTypes("SConfigOptionMapRef").define())
			.put(new Info("map<Ogre::String,Ogre::ConfigOption>::type").cast().pointerTypes("SConfigOptionMapRef").define())
			.put(new Info("std::map<Ogre::String,Ogre::GpuConstantDefinition>").cast().pointerTypes("GpuConstantDefinitionMapRef").define())
			.put(new Info("map<Ogre::String,Ogre::GpuConstantDefinition>::type").cast().pointerTypes("GpuConstantDefinitionMapRef").define())
			.put(new Info("std::map<Ogre::String,Ogre::GpuSharedParametersPtr>").cast().pointerTypes("GpuSharedParametersPtrMapRef").define())
			.put(new Info("map<Ogre::String,Ogre::GpuSharedParametersPtr>::type").cast().pointerTypes("GpuSharedParametersPtrMapRef").define())
			.put(new Info("std::map<Ogre::String,Ogre::ProfileInstance*>").cast().pointerTypes("ProfileInstanceMapRef").define())
			.put(new Info("map<Ogre::String,Ogre::ProfileInstance*>::type").cast().pointerTypes("ProfileInstanceMapRef").define())
			.put(new Info("std::map<Ogre::String,Ogre::String>").cast().pointerTypes("SStringMapRef").define())
			.put(new Info("map<Ogre::String,Ogre::String>::type").cast().pointerTypes("SStringMapRef").define())
			.put(new Info("std::map<Ogre::String,Ogre::ushort>").cast().pointerTypes("SUshortMapRef").define())
			.put(new Info("map<Ogre::String,Ogre::ushort>::type").cast().pointerTypes("SUshortMapRef").define())
			.put(new Info("std::map<Ogre::String,Ogre::v1::Animation*>").cast().pointerTypes("AnimationMapRef").define())
			.put(new Info("map<Ogre::String,Ogre::v1::Animation*>::type").cast().pointerTypes("AnimationMapRef").define())
			.put(new Info("std::map<Ogre::ushort,Ogre::ushort>").cast().pointerTypes("UshortMapRef").define())
			.put(new Info("map<Ogre::ushort,Ogre::ushort>::type").cast().pointerTypes("UshortMapRef").define())
			.put(new Info("std::map<Ogre::VertexBufferPacked*,Ogre::VertexBufferPacked*>").cast().pointerTypes("VertexBufferPackedPtrSelfMap").define())
			.put(new Info("map<Ogre::VertexBufferPacked*,Ogre::VertexBufferPacked*>::type").cast().pointerTypes("VertexBufferPackedPtrSelfMap").define())
			.put(new Info("std::map<size_t,Ogre::GpuLogicalIndexUse>").cast().pointerTypes("GpuLogicalIndexUseMapRef").define())
			.put(new Info("map<size_t,Ogre::GpuLogicalIndexUse>::type").cast().pointerTypes("GpuLogicalIndexUseMapRef").define())
			.put(new Info("std::map<size_t,Ogre::Vector3>").cast().pointerTypes("Vector3MapRef").define())
			.put(new Info("map<size_t,Ogre::Vector3>::type").cast().pointerTypes("Vector3MapRef").define())
			.put(new Info("std::map<unsigned short,NumericAnimationTrack*>").cast().pointerTypes("NumericTrackListRef").define())
			.put(new Info("map<unsigned short,NumericAnimationTrack*>::type").cast().pointerTypes("NumericTrackListRef").define())
			.put(new Info("std::map<unsigned short,Ogre::v1::HardwareVertexBufferSharedPtr>").cast().pointerTypes("HardwareVertexBufferSharedPtrMapRef").define())
			.put(new Info("map<unsigned short,Ogre::v1::HardwareVertexBufferSharedPtr>::type").cast().pointerTypes("HardwareVertexBufferSharedPtrMapRef").define())
			.put(new Info("std::map<unsigned short,Ogre::v1::NumericAnimationTrack*>").cast().pointerTypes("NumericAnimationTrackPtrMapRef").define())
			.put(new Info("map<unsigned short,Ogre::v1::NumericAnimationTrack*>::type").cast().pointerTypes("NumericAnimationTrackPtrMapRef").define())
			.put(new Info("std::map<unsigned short,Ogre::v1::OldNodeAnimationTrack*>").cast().pointerTypes("OldNodeAnimationTrackPtrMapRef").define())
			.put(new Info("map<unsigned short,Ogre::v1::OldNodeAnimationTrack*>::type").cast().pointerTypes("OldNodeAnimationTrackPtrMapRef").define())
			.put(new Info("std::map<unsigned short,Ogre::VertexAnimationTrack*>").cast().pointerTypes("VertexAnimationTrackPtrMapRef").define())
			.put(new Info("map<unsigned short,Ogre::VertexAnimationTrack*>::type").cast().pointerTypes("VertexAnimationTrackPtrMapRef").define())
			.put(new Info("std::map<unsigned short,OldNodeAnimationTrack*>").cast().pointerTypes("OldNodeTrackListRef").define())
			.put(new Info("map<unsigned short,OldNodeAnimationTrack*>::type").cast().pointerTypes("OldNodeTrackListRef").define())
			.put(new Info("std::map<unsigned short,VertexAnimationTrack*>").cast().pointerTypes("VertexTrackListRef").define())
			.put(new Info("map<unsigned short,VertexAnimationTrack*>::type").cast().pointerTypes("VertexTrackListRef").define())
			.put(new Info("std::multimap<Ogre::RenderWindow*,Ogre::WindowEventListener*>").cast().pointerTypes("WindowEventListenerPtrMultiMapRef").define())
			.put(new Info("multimap<Ogre::RenderWindow*,Ogre::WindowEventListener*>::type").cast().pointerTypes("WindowEventListenerPtrMultiMapRef").define())
			.put(new Info("std::multimap<Ogre::TextureUnitState::TextureEffectType,Ogre::TextureUnitState::TextureEffect>").cast().pointerTypes("TextureEffectMultiMap").define())
			.put(new Info("multimap<Ogre::TextureUnitState::TextureEffectType,Ogre::TextureUnitState::TextureEffect>::type").cast().pointerTypes("TextureEffectMultiMap").define())
			.put(new Info("std::multimap<size_t,Ogre::VertexBoneAssignment>").cast().pointerTypes("VertexBoneAssignmentMultimapRef").define())
			.put(new Info("multimap<size_t,Ogre::VertexBoneAssignment>::type").cast().pointerTypes("VertexBoneAssignmentMultimapRef").define())
			.put(new Info("std::set<Ogre::String>").cast().pointerTypes("StringSetRef"))
			.put(new Info("set<Ogre::String>::type").cast().pointerTypes("StringSetRef"))
			.put(new Info("std::set<Ogre::ushort>").cast().pointerTypes("UshortSetRef"))
			.put(new Info("set<Ogre::ushort>::type").cast().pointerTypes("UshortSetRef"))
			.put(new Info("std::set<Ogre::v1::Entity*>").cast().pointerTypes("EntityPtrSetRef").define())
			.put(new Info("set<Ogre::v1::Entity*>::type").cast().pointerTypes("EntityPtrSetRef"))
			.put(new Info("std::set<std::string>").cast().pointerTypes("StringSetRef").define())
			.put(new Info("set<std::string>::type").cast().pointerTypes("StringSetRef"))
			.put(new Info("std::pair<bool,Ogre::Real>").cast().pointerTypes("RealPairRef").define())
			.put(new Info("std::pair<bool,Ogre::Real>::type").cast().pointerTypes("RealPairRef"))
			.put(new Info("std::pair<size_t,size_t>").cast().pointerTypes("SizetPairRef").define())
			.put(new Info("std::pair<size_t,size_t>::type").cast().pointerTypes("SizetPairRef").define())
			.put(new Info("std::pair<bool,Ogre::ResourcePtr>").cast().pointerTypes("ResourcePtrPairRef").define())
			.put(new Info("std::pair<bool,Ogre::ResourcePtr>::type").cast().pointerTypes("ResourcePtrPairRef").define())
			.put(new Info("std::unordered_map<Ogre::String,Ogre::ushort>").cast().pointerTypes("SUshortUnorderedMapRef"))
			.put(new Info("unordered_map<Ogre::String,Ogre::ushort>::type").cast().pointerTypes("SUshortUnorderedMapRef"))
			.put(new Info("std::unordered_map<Ogre::String,ushort>").cast().pointerTypes("SUshortUnorderedMapRef").define())
			.put(new Info("unordered_map<Ogre::String,ushort>::type").cast().pointerTypes("SUshortUnorderedMapRef"))
			.put(new Info("std::unordered_map<unsigned int,Ogre::String>").cast().pointerTypes("StringUnorderedMapRef").define())
			.put(new Info("unordered_map<unsigned int,Ogre::String>::type").cast().pointerTypes("StringUnorderedMapRef").define())
			.put(new Info("std::vector<char*>").cast().pointerTypes("CharPtrVectorRef").define())
			.put(new Info("vector<char*>::type").cast().pointerTypes("CharPtrVectorRef").define())
			.put(new Info("std::vector<char>").cast().pointerTypes("CharVectorRef").define())
			.put(new Info("vector<char>::type").cast().pointerTypes("CharVectorRef").define())
			.put(new Info("std::vector<const Ogre::Image*>").cast().pointerTypes("ImagePtrVectorRef").define())
			.put(new Info("vector<const Ogre::Image*>::type").cast().pointerTypes("ImagePtrVectorRef").define())
			.put(new Info("std::vector<double>").cast().pointerTypes("DoubleVectorRef").define())
			.put(new Info("vector<double>::type").cast().pointerTypes("DoubleVectorRef").define())
			.put(new Info("std::vector<float>").cast().pointerTypes("FloatVectorRef").define())
			.put(new Info("vector<float>::type").cast().pointerTypes("FloatVectorRef").define())
			.put(new Info("std::vector<IndexData*>").cast().pointerTypes("IndexDataPtrVectorRef").define())
			.put(new Info("vector<IndexData*>::type").cast().pointerTypes("IndexDataPtrVectorRef").define())
			.put(new Info("std::vector<int>").cast().pointerTypes("IntVectorRef").define())
			.put(new Info("vector<int>::type").cast().pointerTypes("IntVectorRef").define())
			.put(new Info("std::vector<Ogre::Bone*>").cast().pointerTypes("BonePtrVectorRef").define())
			.put(new Info("vector<Ogre::Bone*>::type").cast().pointerTypes("BonePtrVectorRef").define())
			.put(new Info("std::vector<Ogre::Camera*>").cast().pointerTypes("CameraPtrVectorRef").define())
			.put(new Info("vector<Ogre::Camera*>::type").cast().pointerTypes("CameraPtrVectorRef").define())
			.put(new Info("std::vector<Ogre::CompositorPassDef*>").cast().pointerTypes("CompositorPassDefPtrVectorRef").define())
			.put(new Info("vector<Ogre::CompositorPassDef*>::type").cast().pointerTypes("CompositorPassDefPtrVectorRef").define())
			.put(new Info("std::vector<Ogre::CompositorPassDef::UavDependency>").cast().pointerTypes("UavDependencyVectorRef").define())
			.put(new Info("vector<Ogre::CompositorPassDef::UavDependency>::type").cast().pointerTypes("UavDependencyVectorRef").define())
			.put(new Info("std::vector<Ogre::CompositorTexture>").cast().pointerTypes("CompositorTextureVectorRef").define())
			.put(new Info("vector<Ogre::CompositorTexture>::type").cast().pointerTypes("CompositorTextureVectorRef").define())
			.put(new Info("std::vector<Ogre::Frustum*>").cast().pointerTypes("FrustumPtrVectorRef").define())
			.put(new Info("vector<Ogre::Frustum*>::type").cast().pointerTypes("FrustumPtrVectorRef").define())
			.put(new Info("std::vector<Ogre::GpuProgramParameters::AutoConstantEntry>").cast().pointerTypes("AutoConstantEntryVectorRef").define())
			.put(new Info("vector<Ogre::GpuProgramParameters::AutoConstantEntry>::type").cast().pointerTypes("AutoConstantEntryVectorRef").define())
			.put(new Info("std::vector<Ogre::GpuSharedParametersUsage>").cast().pointerTypes("GpuSharedParametersUsageVectorRef").define())
			.put(new Info("vector<Ogre::GpuSharedParametersUsage>::type").cast().pointerTypes("GpuSharedParametersUsageVectorRef").define())
			.put(new Info("std::vector<Ogre::IdString>").cast().pointerTypes("IdStringVectorRef").define())
			.put(new Info("vector<Ogre::IdString>::type").cast().pointerTypes("IdStringVectorRef").define())
			.put(new Info("std::vector<Ogre::InstancedEntity*>").cast().pointerTypes("InstancedEntityPtrVectorRef").define())
			.put(new Info("vector<Ogre::InstancedEntity*>::type").cast().pointerTypes("InstancedEntityPtrVectorRef").define())
			.put(new Info("std::vector<Ogre::KeyFrameRig>").cast().pointerTypes("KeyFrameRigVectorRef").define())
			.put(new Info("vector<Ogre::KeyFrameRig>::type").cast().pointerTypes("KeyFrameRigVectorRef").define())
			.put(new Info("std::vector<Ogre::ObjectMemoryManager*>").cast().pointerTypes("ObjectMemoryManagerPtrVectorRef").define())
			.put(new Info("vector<Ogre::ObjectMemoryManager*>::type").cast().pointerTypes("ObjectMemoryManagerPtrVectorRef").define())
			.put(new Info("std::vector<Ogre::ParameterDef>").cast().pointerTypes("ParameterDefVectorRef").define())
			.put(new Info("vector<Ogre::ParameterDef>::type").cast().pointerTypes("ParameterDefVectorRef").define())
			.put(new Info("std::vector<Ogre::Plane>").cast().pointerTypes("PlaneVectorRef").define())
			.put(new Info("vector<Ogre::Plane>::type").cast().pointerTypes("PlaneVectorRef").define())
			.put(new Info("std::vector<Ogre::PlaneBoundedVolume>").cast().pointerTypes("PlaneBoundedVolumeVectorRef").define())
			.put(new Info("vector<Ogre::PlaneBoundedVolume>::type").cast().pointerTypes("PlaneBoundedVolumeVectorRef").define())
			.put(new Info("std::vector<Ogre::Plugin*>").cast().pointerTypes("PluginPtrVectorRef").define())
			.put(new Info("vector<Ogre::Plugin*>::type").cast().pointerTypes("PluginPtrVectorRef").define())
			.put(new Info("std::vector<Ogre::RaySceneQueryResultEntry>").cast().pointerTypes("RaySceneQueryResultEntryVectorRef").define())
			.put(new Info("vector<Ogre::RaySceneQueryResultEntry>::type").cast().pointerTypes("RaySceneQueryResultEntryVectorRef").define())
			.put(new Info("std::vector<Ogre::Real>").cast().pointerTypes("RealVectorRef").define())
			.put(new Info("vector<Ogre::Real>::type").cast().pointerTypes("RealVectorRef").define())
			.put(new Info("std::vector<Ogre::RenderSystem*>").cast().pointerTypes("RenderSystemPtrVectorRef").define())
			.put(new Info("vector<Ogre::RenderSystem*>::type").cast().pointerTypes("RenderSystemPtrVectorRef").define())
			.put(new Info("std::vector<Ogre::RenderTexture*>").cast().pointerTypes("RenderTexturePtrVectorRef").define())
			.put(new Info("vector<Ogre::RenderTexture*>::type").cast().pointerTypes("RenderTexturePtrVectorRef").define())
			.put(new Info("std::vector<Ogre::RenderWindow*>").cast().pointerTypes("RenderWindowPtrVectorRef").define())
			.put(new Info("vector<Ogre::RenderWindow*>::type").cast().pointerTypes("RenderWindowPtrVectorRef").define())
			.put(new Info("std::vector<Ogre::RenderWindowDescription>").cast().pointerTypes("RenderWindowDescriptionVectorRef").define())
			.put(new Info("vector<Ogre::RenderWindowDescription>::type").cast().pointerTypes("RenderWindowDescriptionVectorRef").define())
			.put(new Info("std::vector<Ogre::ShadowTextureConfig>").cast().pointerTypes("ShadowTextureConfigVectorRef").define())
			.put(new Info("vector<Ogre::ShadowTextureConfig>::type").cast().pointerTypes("ShadowTextureConfigVectorRef").define())
			.put(new Info("std::vector<Ogre::SkeletonAnimation>").cast().pointerTypes("SkeletonAnimationVectorRef").define())
			.put(new Info("vector<Ogre::SkeletonAnimation>::type").cast().pointerTypes("SkeletonAnimationVectorRef").define())
			.put(new Info("std::vector<Ogre::String>").cast().pointerTypes("StringVectorRef").define())
			.put(new Info("vector<Ogre::String>::type").cast().pointerTypes("StringVectorRef").define())
			.put(new Info("std::vector<Ogre::TexturePtr>").cast().pointerTypes("TexturePtrVectorRef").define())
			.put(new Info("vector<Ogre::TexturePtr>::type").cast().pointerTypes("TexturePtrVectorRef").define())
			.put(new Info("std::vector<Ogre::ThreadHandlePtr>").cast().pointerTypes("ThreadHandlePtrVectorRef").define())
			.put(new Info("vector<Ogre::ThreadHandlePtr>::type").cast().pointerTypes("ThreadHandlePtrVectorRef").define())
			.put(new Info("std::vector<Ogre::uint>").cast().pointerTypes("UintVectorRef").define())
			.put(new Info("vector<Ogre::uint>::type").cast().pointerTypes("UintVectorRef").define())
			.put(new Info("std::vector<Ogre::ushort>").cast().pointerTypes("UshortVectorRef").define())
			.put(new Info("vector<Ogre::ushort>::type").cast().pointerTypes("UshortVectorRef").define())
			.put(new Info("std::vector<Ogre::v1::EdgeData::Edge>").cast().pointerTypes("EdgeVectorRef").define())
			.put(new Info("vector<Ogre::v1::EdgeData::Edge>::type").cast().pointerTypes("EdgeVectorRef").define())
			.put(new Info("std::vector<Ogre::v1::EdgeData::EdgeGroup>").cast().pointerTypes("EdgeGroupVectorRef").define())
			.put(new Info("vector<Ogre::v1::EdgeData::EdgeGroup>::type").cast().pointerTypes("EdgeGroupVectorRef").define())
			.put(new Info("std::vector<Ogre::v1::EdgeData::Triangle>").cast().pointerTypes("TriangleVectorRef").define())
			.put(new Info("vector<Ogre::v1::EdgeData::Triangle>::type").cast().pointerTypes("TriangleVectorRef").define())
			.put(new Info("std::vector<Ogre::v1::HardwareBuffer::Usage>").cast().pointerTypes("HardwareBufferUsageVectorRef").define())
			.put(new Info("vector<Ogre::v1::HardwareBuffer::Usage>::type").cast().pointerTypes("HardwareBufferUsageVectorRef").define())
			.put(new Info("std::vector<Ogre::v1::NodeAnimationTrack*>").cast().pointerTypes("NodeAnimationTrackPtrVectorRef").define())
			.put(new Info("vector<Ogre::v1::NodeAnimationTrack*>::type").cast().pointerTypes("NodeAnimationTrackPtrVectorRef").define())
			.put(new Info("std::vector<Ogre::v1::StaticGeometry::SubMeshLodGeometryLink>").cast().pointerTypes("SubMeshLodGeometryLinkVectorRef").define())
			.put(new Info("vector<Ogre::v1::StaticGeometry::SubMeshLodGeometryLink>::type").cast().pointerTypes("SubMeshLodGeometryLinkVectorRef").define())
			.put(new Info("std::vector<Ogre::v1::VertexData::HardwareAnimationData>").cast().pointerTypes("HardwareAnimationDataVectorRef").define())
			.put(new Info("vector<Ogre::v1::VertexData::HardwareAnimationData>::type").cast().pointerTypes("HardwareAnimationDataVectorRef").define())
			.put(new Info("std::vector<Ogre::v1::VertexPoseKeyFrame::PoseRef>").cast().pointerTypes("PoseRefVectorRef").define())
			.put(new Info("vector<Ogre::v1::VertexPoseKeyFrame::PoseRef>::type").cast().pointerTypes("PoseRefVectorRef").define())
			.put(new Info("std::vector<Ogre::Vector3>").cast().pointerTypes("Vector3VectorRef").define())
			.put(new Info("vector<Ogre::Vector3>::type").cast().pointerTypes("Vector3VectorRef").define())
			.put(new Info("std::vector<Ogre::Vector4>").cast().pointerTypes("Vector4VectorRef").define())
			.put(new Info("vector<Ogre::Vector4>::type").cast().pointerTypes("Vector4VectorRef").define())
			.put(new Info("std::vector<Ogre::VertexBufferPacked*>").cast().pointerTypes("VertexBufferPackedPtrVectorRef").define())
			.put(new Info("vector<Ogre::VertexBufferPacked*>::type").cast().pointerTypes("VertexBufferPackedPtrVectorRef").define())
			.put(new Info("std::vector<Ogre::VertexElement2>").cast().pointerTypes("VertexElement2VectorRef").define())
			.put(new Info("vector<Ogre::VertexElement2>::type").cast().pointerTypes("VertexElement2VectorRef").define())
			.put(new Info("std::vector<Ogre::VertexElement2Vec>").cast().pointerTypes("VertexElement2VecVectorRef").define())
			.put(new Info("vector<Ogre::VertexElement2Vec>::type").cast().pointerTypes("VertexElement2VecVectorRef").define())
			.put(new Info("std::vector<size_t>").cast().pointerTypes("SizeVectorRef").define())
			.put(new Info("vector<size_t>::type").cast().pointerTypes("SizeVectorRef").define())
			.put(new Info("std::vector<std::pair<Ogre::String,Ogre::String> >").cast().pointerTypes("StringPairVectorRef").define())
			.put(new Info("vector<std::pair<Ogre::String,Ogre::String> >::type").cast().pointerTypes("StringPairVectorRef").define())

			// Ogre template
			.put(new Info("Ogre::AtomicScalar<Ogre::uint32>").cast().pointerTypes("UInt32AtomicScalarRef").define())
			.put(new Info("Ogre::AtomicScalar<unsigned int>").cast().pointerTypes("UIntAtomicScalarRef").define())
			.put(new Info("Ogre::BackgroundProcessTicket").valueTypes("long"))
			.put(new Info("Ogre::Controller<Ogre::Real>").cast().pointerTypes("RealControllerRef").define())
			.put(new Info("Ogre::ControllerFunction<Ogre::Ogre::Real>").cast().pointerTypes("RealControllerFunctionRef").define())
			.put(new Info("Ogre::ControllerValue<Ogre::Ogre::Real>").cast().pointerTypes("RealControllerValueRef").define())
			.put(new Info("Ogre::ControllerValue<Ogre::Real>").cast().pointerTypes("RealControllerValueRef").define())
			.put(new Info("Ogre::map<Ogre::String,Ogre::ProfileInstance*>::type").cast().pointerTypes("ProfileInstanceMapRef").define())
			.put(new Info("Ogre::Pool<Ogre::ResourcePtr>").cast().pointerTypes("ResourcePtrPoolRef").define())
			.put(new Info("Ogre::RawSimdUniquePtr<Ogre::ArrayReal,Ogre::MEMCATEGORY_ANIMATION>").cast().pointerTypes("MemArrayRealRawSimdUniquePtr").define())
			.put(new Info("Ogre::RawSimdUniquePtr<ArrayReal,Ogre::MEMCATEGORY_ANIMATION>").cast().pointerTypes("MemArrayRealRawSimdUniquePtr").define())
			.put(new Info("Ogre::RenderTexture").cast().pointerTypes("RenderTexture").define())
			.put(new Info("Ogre::SharedPtr<Ogre::ControllerFunction<Ogre::Ogre::Real> >").cast().pointerTypes("RealControllerFunctionSPtr").define())
			.put(new Info("Ogre::SharedPtr<Ogre::ControllerValue<Ogre::Ogre::Real> >").cast().pointerTypes("RealControllerValueSPtr").define())
			.put(new Info("Ogre::SharedPtr<Ogre::FileInfoList>").cast().pointerTypes("FileInfoListPtr").define())
			.put(new Info("Ogre::SharedPtr<Ogre::v1::HardwareCounterBuffer>").cast().pointerTypes("HardwareCounterBufferSPtr").define())
			.put(new Info("Ogre::SharedPtr<Ogre::v1::HardwareIndexBuffer>").cast().pointerTypes("HardwareIndexBufferSPtr").define())
			.put(new Info("Ogre::SharedPtr<Ogre::v1::HardwarePixelBuffer>").cast().pointerTypes("HardwarePixelBufferSPtr").define())
			.put(new Info("Ogre::SharedPtr<Ogre::v1::HardwareUniformBuffer>").cast().pointerTypes("HardwareUniformBufferSPtr").define())
			.put(new Info("Ogre::SharedPtr<Ogre::v1::HardwareVertexBuffer>").cast().pointerTypes("HardwareVertexBufferSPtr").define())
			.put(new Info("Ogre::Singleton<HardwareBufferManager>").cast().pointerTypes("HardwareBufferManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::ArchiveManager>").cast().pointerTypes("ArchiveManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::ControllerManager>").cast().pointerTypes("ControllerManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::GpuProgramManager>").cast().pointerTypes("GpuProgramManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::HardwareBufferManager>").cast().pointerTypes("HardwareBufferManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::HardwareBufferManager>").cast().pointerTypes("HardwareBufferManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::HighLevelGpuProgramManager>").cast().pointerTypes("HighLevelGpuProgramManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::LogManager>").cast().pointerTypes("LogManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::MaterialManager>").cast().pointerTypes("MaterialManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::MeshManager>").cast().pointerTypes("MeshManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::ParticleSystemManager>").cast().pointerTypes("ParticleSystemManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::Profiler>").cast().pointerTypes("ProfilerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::ResourceBackgroundQueue>").cast().pointerTypes("ResourceBackgroundQueueSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::ResourceGroupManager>").cast().pointerTypes("ResourceGroupManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::Root>").cast().pointerTypes("RootSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::SceneManagerEnumerator>").cast().pointerTypes("SceneManagerEnumeratorSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::ShadowTextureManager>").cast().pointerTypes("ShadowTextureManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::TextureManager>").cast().pointerTypes("TextureManagerSgtRef").define())
			.put(new Info("Ogre::Singleton<Ogre::v1::OldSkeletonManager>").cast().pointerTypes("OldSkeletonManagerSgtRef").define())
			.put(new Info("std::set<Ogre::SceneQuery::WorldFragmentType>").cast().pointerTypes("WorldFragmentTypeSetRef").define())
			.put(new Info("set<Ogre::SceneQuery::WorldFragmentType>::type").cast().pointerTypes("WorldFragmentTypeSetRef").define())

			// basic type
			.put(new Info("uint16", "Ogre::ushort").valueTypes("short").define())
			.put(new Info("uint32").valueTypes("int").define())
			.put(new Info("uint64").valueTypes("long").define())
			.put(new Info("uint8").valueTypes("byte").define())
		
			// TRect template
			.put(new Info("WorkQueue::RequestID").cast().valueTypes("unsigned long"))
			.put(new Info("Ogre::TRect").cast().pointerTypes("TRectRef").define())
			.put(new Info("Ogre::TRect<float>").cast().pointerTypes("FloatRectRef").define())
			.put(new Info("Ogre::TRect<Real>").cast().pointerTypes("RealRectRef").define())
			.put(new Info("Ogre::TRect<long>").cast().pointerTypes("RectRef").define())
			.put(new Info("TRect").javaNames("TRectRef"))
			.put(new Info("TRect<float>").javaNames("FloatRectRef"))
			.put(new Info("TRect<Real>").javaNames("RealRectRef"))
			.put(new Info("TRect<long>").javaNames("RectRef"))
			.put(new Info("Ogre::FloatRect").javaNames("FloatRectRef"))
			.put(new Info("Ogre::RealRect").javaNames("RealRectRef"))
			.put(new Info("Ogre::Rect").javaNames("RectRef"))
			.put(new Info("FloatRect").javaNames("FloatRectRef"))
			.put(new Info("RealRect").javaNames("RealRectRef"))
			.put(new Info("Rect").javaNames("RectRef"))

			// Some definition
			.put(new Info("_StringBase", "Ogre::String", "std::string").pointerTypes("String"))
			.put(new Info("_StringStreamBase", "Ogre::stringstream", "Ogre::StringStream", "std::basic_stringstream<char,std::char_traits<char>,std::allocator<char> >").cast().pointerTypes("StringStream").define())
			.put(new Info("__cplusplus").define())
			.put(new Info("OGRE_ARCH_TYPE", "OGRE_ARCHITECTURE_64").define())
			.put(new Info("OGRE_PLATFORM", "OGRE_PLATFORM_LINUX").define())
			.put(new Info("OGRE_WCHAR_T_STRINGS", "OGRE_STRING_USE_CUSTOM_MEMORY_ALLOCATOR").define(false))
			.put(new Info("Real", "Ogre::Real").valueTypes("double").define())
			.put(new Info("Ogre::Resource::Listener").pointerTypes("ResourceListener"))
			.put(new Info("Ogre::WorkQueue::RequestHandler").pointerTypes("WorkQueueRequestHandler"))
			.put(new Info("Ogre::WorkQueue::ResponseHandler").pointerTypes("WorkQueueResponseHandler"))
			.put(new Info("Ogre::Node::Listener").pointerTypes("NodeListener"))

			// Some class should ignore
			.put(new Info("Ogre::StringUtil", 
						  "type_info", 
						  // "Ogre::ReadBarrier::ReadBarrier", 
						  // "Ogre::WriteBarrier::WriteBarrier",
						  // "Ogre::ResourceAccess::ResourceAccess", 
						  // "Ogre::ResourceLayout::Layout",
						  "__m128", "__m128i", "ArrayReal", "ArrayMaskR").skip())

			.put(new Info("CategorisedAllocPolicy",
						  "CategorisedAlignAllocPolicy",
						  "AllocatedObject",
						  "GeneralAllocPolicy",
						  "GeometryAllocPolicy",
						  "AnimationAllocPolicy",
						  "SceneCtlAllocPolicy",
						  "SceneObjAllocPolicy",
						  "ResourceAllocPolicy",
						  "ScriptingAllocPolicy",
						  "RenderSysAllocPolicy",
						  "ResourceSimdAllocPolicy",
						  "SceneCtlAlignPolicy",
						  "GeneralAllocatedObject",
						  "GeometryAllocatedObject",
						  "AnimationAllocatedObject",
						  "SceneCtlAllocatedObject",
						  "SceneObjAllocatedObject",
						  "ResourceAllocatedObject",
						  "ScriptingAllocatedObject",
						  "RenderSysAllocatedObject",
						  "ResourceSimdAllocObject",
						  "SceneCtlAlignedObject",
						  "AbstractNodeAlloc",
						  "AnimableAlloc",
						  "AnimationAlloc",
						  "ArchiveAlloc",
						  "BatchedGeometryAlloc",
						  "BufferAlloc",
						  "BufferPackedAlloc",
						  "CodecAlloc",
						  "CompositorInstAlloc",
						  "ConfigAlloc",
						  "ControllerAlloc",
						  "DebugGeomAlloc",
						  "DynLibAlloc",
						  "EdgeDataAlloc",
						  "FactoryAlloc",
						  "FXAlloc",
						  "ImageAlloc",
						  "IndexDataAlloc",
						  "LogAlloc",
						  "MovableAlloc",
						  "NodeAlloc",
						  "OverlayAlloc",
						  "GpuParamsAlloc",
						  "PassAlloc",
						  "HlmsAlloc",
						  "PatchAlloc",
						  "PluginAlloc",
						  "ProfilerAlloc",
						  "ProgMeshAlloc",
						  "RenderQueueAlloc",
						  "RenderSysAlloc",
						  "RootAlloc",
						  "ResourceAlloc",
						  "SerializerAlloc",
						  "SceneMgtAlignedAlloc",
						  "SceneMgtAlloc",
						  "ScriptCompilerAlloc",
						  "ScriptTranslatorAlloc",
						  "ShadowDataAlloc",
						  "StagingBufferAlloc",
						  "StreamAlloc",
						  "SubEntityAlloc",
						  "SubMeshAlloc",
						  "TechniqueAlloc",
						  "TimerAlloc",
						  "TextureUnitStateAlloc",
						  "UtilityAlloc",
						  "VertexDataAlloc",
						  "VertexArrayObjectAlloc",
						  "ViewportAlloc",
						  "LodAlloc",
						  "FileSystemLayerAlloc",
						  "StereoDriverAlloc").skip().pointerTypes("Pointer"))
			
			.put(new Info("Ogre::WriteBarrier::All").javaNames("WriteBarrierEnum"))
			.put(new Info("Ogre::ReadBarrier::All").javaNames("ReadBarrierEnum"))
			.put(new Info("Ogre::ResourceLayout::All").javaNames("ResourceLayoutEnum"))
			.put(new Info("Ogre::ResourceAccess::All").javaNames("ResourceAccessEnum"))
		;
	}


	// /** enum Ogre::WriteBarrier::WriteBarrier */
 //    public static class WriteBarrierEnum {
 //        public static final int

 //            CpuWrite =  0x00000001,

 //            Uav =  0x00000002,

 //            RenderTarget =  0x00000004,

 //            DepthStencil =  0x00000008,

 //            All =  0xffffffff;
 //    }

 //    /** enum Ogre::ReadBarrier::ReadBarrier */
 //    public static class ReadBarrierEnum {
 //        public static final int

 //            CpuRead =  0x00000001,

 //            Indirect =  0x00000002,

 //            VertexBuffer =  0x00000004,

 //            IndexBuffer =  0x00000008,

 //            ConstBuffer =  0x00000010,

 //            Texture =  0x00000020,

 //            Uav =  0x00000040,

 //            RenderTarget =  0x00000080,

 //            DepthStencil =  0x00000100,

 //            All =  0xffffffff;
 //    }

 //    /** enum Ogre::ResourceLayout::Layout */
 //    public static class ResourceLayoutEnum {
 //        public static final int
 //            Undefined = 0,
 //            Texture = 1,
 //            TextureDepth = 2,
 //            RenderTarget = 3,
 //            RenderDepth = 4,
 //            Clear = 5,
 //            Uav = 6,
 //            CopySrc = 7,
 //            CopyDst = 8,

 //            NumResourceLayouts = 9;
 //    }
    
    
    
 //    /** enum Ogre::ResourceAccess::ResourceAccess */
 //    public static class ResourceAccessEnum {
 //        public static final int
 //            Undefined =  0x00,
 //            Read =  0x01,
 //            Write =  0x10,
 //            ReadWrite =  Read | Write;
 //    }
}
