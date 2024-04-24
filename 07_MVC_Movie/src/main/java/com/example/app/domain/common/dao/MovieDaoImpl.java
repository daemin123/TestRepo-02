package com.example.app.domain.common.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.app.domain.common.dao.common.CommonDao;
import com.example.app.domain.common.dto.Criteria;
import com.example.app.domain.common.dto.MovieDto;




public class MovieDaoImpl extends CommonDao implements MovieDao {
	
	private static MovieDao instance ;
	public static MovieDao getInstance() throws Exception {
		if(instance==null)
			instance=new MovieDaoImpl();
		return instance;
	}
	private MovieDaoImpl() throws Exception{
		System.out.println("[DAO] MovieDaoImpl's INIT.." + conn);
		
	}
	
	//INSERT
	@Override
	public boolean Insert(MovieDto dto) throws Exception{
		pstmt = conn.prepareStatement("insert into movie values(?,?,?,?,?,?)");
		pstmt.setInt(1, dto.get영화_ID());
		pstmt.setString(2, dto.get영화제목());
		pstmt.setString(3, dto.get영화장르());
		pstmt.setBoolean(4, dto.is영화예매여부());
		pstmt.setString(5, dto.get상영장소());
		pstmt.setString(6, dto.get상영시간());
		int result = pstmt.executeUpdate();
		
		freeConnection(pstmt);
		return result>0;
	}
	
	//UPDATE
	//DELETE
	
	//SELECTALL
	@Override
	public List<MovieDto> SelectAll() throws Exception{
		pstmt = conn.prepareStatement("select * from movie order by 영화_ID desc");
		rs =  pstmt.executeQuery();
		List<MovieDto> list = new ArrayList();
		MovieDto dto = null;
		if(rs!=null)
		{
			while(rs.next()) {
				dto = new MovieDto();
				dto.set영화_ID(rs.getInt("영화_ID"));
				dto.set영화제목(rs.getString("영화제목"));
				dto.set영화장르(rs.getString("영화장르"));
				dto.set영화예매여부(rs.getBoolean("영화예매여부"));
				dto.set상영장소(rs.getString("상영장소"));
				dto.set상영시간(rs.getString("상영시간"));
			
				list.add(dto);
			}
		}	
		
		
		freeConnection(pstmt,rs);
		return list;
	}
	
	
	//SELECTONE
	@Override
	public MovieDto Select(int 영화_ID) throws Exception {
		pstmt = conn.prepareStatement("select * from movie where 영화_ID=?");
		pstmt.setInt(1, 영화_ID);
		rs =  pstmt.executeQuery();
		
		MovieDto dto = null;
		if(rs!=null)
		{
				rs.next();
				dto = new MovieDto();
				dto.set영화_ID(rs.getInt("영화_ID"));
				dto.set영화제목(rs.getString("영화제목"));
				dto.set영화장르(rs.getString("영화장르"));
				dto.set영화예매여부(rs.getBoolean("영화예매여부"));
				dto.set상영장소(rs.getString("상영장소"));
				dto.set상영시간(rs.getString("상영시간"));		
		}	
		
		freeConnection(pstmt,rs);
		return dto;
	}
	
	//COUNT
	@Override
	public int Count() throws Exception {
		pstmt = conn.prepareStatement("select count(*) from movie");
		rs =  pstmt.executeQuery();
		
		int count = 0;
		if(rs.next())
			count = rs.getInt(1);
			
		
		freeConnection(pstmt,rs);
		return count;
	}
	
	@Override
	public int Count(Criteria criteria) throws Exception  {
		pstmt = conn.prepareStatement("select count(*) from movie where "+criteria.getType()+" like '%"+criteria.getKeyword()+"%' ");
		rs =  pstmt.executeQuery();
		
		int count = 0;
		if(rs.next())
			count = rs.getInt(1);
			
		
		freeConnection(pstmt,rs);
		return count;
	}
	
	
	@Override
	public List<MovieDto> selectAll(int offset, int amount) throws SQLException {
		pstmt = conn.prepareStatement("select * from movie order by 영화_ID desc limit ?,?");
		pstmt.setInt(1, offset);
		pstmt.setInt(2, amount);
		rs =  pstmt.executeQuery();
		List<MovieDto> list = new ArrayList();
		MovieDto dto = null;
		if(rs!=null)
		{
			while(rs.next()) {
				dto = new MovieDto();
				dto.set영화_ID(rs.getInt("영화_ID"));
				dto.set영화제목(rs.getString("영화제목"));
				dto.set영화장르(rs.getString("영화장르"));
				dto.set영화예매여부(rs.getBoolean("영화예매여부"));
				dto.set상영장소(rs.getString("상영장소"));
				dto.set상영시간(rs.getString("상영시간"));
				list.add(dto);
			}
		}	
	
		freeConnection(pstmt,rs);
		return list;
		
	}	
	@Override
	public List<MovieDto> selectAll(int offset, int amount, Criteria criteria) throws Exception {
		pstmt = conn.prepareStatement("select * from movie where "+criteria.getType()+" like '%"+criteria.getKeyword()+"%' order by bookCode desc limit ?,?");
		pstmt.setInt(1, offset);
		pstmt.setInt(2, amount);
		rs =  pstmt.executeQuery();
		List<MovieDto> list = new ArrayList();
		MovieDto dto = null;
		if(rs!=null)
		{
			while(rs.next()) {
				dto = new MovieDto();
				dto.set영화_ID(rs.getInt("영화_ID"));
				dto.set영화제목(rs.getString("영화제목"));
				dto.set영화장르(rs.getString("영화장르"));
				dto.set영화예매여부(rs.getBoolean("영화예매여부"));
				dto.set상영장소(rs.getString("상영장소"));
				dto.set상영시간(rs.getString("상영시간"));
				list.add(dto);
			}
		}	
	
		freeConnection(pstmt,rs);
		return list;
	}
	
	
	
		
}